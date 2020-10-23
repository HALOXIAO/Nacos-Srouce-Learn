package com.alibaba.nacos.client;

import com.alibaba.fastjson.JSON;
import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.PropertyKeyConst;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.client.naming.NacosNamingService;
import com.alibaba.nacos.client.naming.beat.BeatInfo;
import com.alibaba.nacos.client.naming.beat.BeatReactor;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import org.junit.Test;

import java.util.*;

public class DiscoveryTest {

    private final String address = "49.234.83.167";
    private final String serviceName = "Halo_Test";
    private final String groupName = "Test";
    private final String ip = "http://linkworld.natapp1.cc";
    private final Integer serverPort = 8081;

    @Test
    public void content() throws NacosException, InterruptedException {


        NacosFactory factory = new NacosFactory();
        NacosNamingService namingService = (NacosNamingService) factory.createNamingService(address);
//        namingService.registerInstance(serviceName, groupName, ip, serverPort);
//        List<String> serverList = namingService.serverProxy.getServerListFromEndpoint();
//        System.out.println(serverList.toString());
        BeatReactor reactor = namingService.getBeatReactor();
        BeatInfo beatInfo = new BeatInfo();
        beatInfo.setIp(ip);
        beatInfo.setPort(serverPort);
        beatInfo.setServiceName(serviceName);
        String str = JSON.toJSONString(beatInfo);
//        System.out.println(str);
        reactor.addBeatInfo(serviceName, beatInfo);
    }




    public Properties init() {
        Properties properties = new Properties();
        properties.setProperty(PropertyKeyConst.ENDPOINT, address + ":" + "8848");
//        properties.setProperty()
        return properties;
    }

}
