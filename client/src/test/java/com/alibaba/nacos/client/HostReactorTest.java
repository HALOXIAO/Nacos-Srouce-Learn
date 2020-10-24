package com.alibaba.nacos.client;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import com.alibaba.nacos.client.naming.NacosNamingService;
import org.junit.Test;

import java.util.List;

public class HostReactorTest {


    private final String address = "49.234.83.167";
    private final String serviceName = "Halo_Test";
    private final String groupName = "Test";
    private final String ip = "http://linkworld.natapp1.cc";
    private final Integer serverPort = 8081;


    @Test
    public void context() throws NacosException {
        NacosNamingService namingService = (NacosNamingService) NacosFactory.createNamingService(address);
        List<Instance> result =  namingService.getAllInstances(serviceName);
        System.out.println(result.toString());
    }

}
