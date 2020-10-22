// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gateway.proto

package com.alibaba.nacos.istio.model;

public interface GatewayOrBuilder extends
    // @@protoc_insertion_point(interface_extends:istio.networking.v1alpha3.Gateway)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * REQUIRED: A list of server specifications.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.Server servers = 1;</code>
   */
  java.util.List<com.alibaba.nacos.istio.model.Server> 
      getServersList();
  /**
   * <pre>
   * REQUIRED: A list of server specifications.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.Server servers = 1;</code>
   */
  com.alibaba.nacos.istio.model.Server getServers(int index);
  /**
   * <pre>
   * REQUIRED: A list of server specifications.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.Server servers = 1;</code>
   */
  int getServersCount();
  /**
   * <pre>
   * REQUIRED: A list of server specifications.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.Server servers = 1;</code>
   */
  java.util.List<? extends com.alibaba.nacos.istio.model.ServerOrBuilder> 
      getServersOrBuilderList();
  /**
   * <pre>
   * REQUIRED: A list of server specifications.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.Server servers = 1;</code>
   */
  com.alibaba.nacos.istio.model.ServerOrBuilder getServersOrBuilder(
      int index);

  /**
   * <pre>
   * REQUIRED: One or more labels that indicate a specific set of pods/VMs
   * on which this gateway configuration should be applied. The scope of
   * label search is restricted to the configuration namespace in which the
   * the resource is present. In other words, the Gateway resource must
   * reside in the same namespace as the gateway workload instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; selector = 2;</code>
   */
  int getSelectorCount();
  /**
   * <pre>
   * REQUIRED: One or more labels that indicate a specific set of pods/VMs
   * on which this gateway configuration should be applied. The scope of
   * label search is restricted to the configuration namespace in which the
   * the resource is present. In other words, the Gateway resource must
   * reside in the same namespace as the gateway workload instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; selector = 2;</code>
   */
  boolean containsSelector(
      java.lang.String key);
  /**
   * Use {@link #getSelectorMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getSelector();
  /**
   * <pre>
   * REQUIRED: One or more labels that indicate a specific set of pods/VMs
   * on which this gateway configuration should be applied. The scope of
   * label search is restricted to the configuration namespace in which the
   * the resource is present. In other words, the Gateway resource must
   * reside in the same namespace as the gateway workload instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; selector = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getSelectorMap();
  /**
   * <pre>
   * REQUIRED: One or more labels that indicate a specific set of pods/VMs
   * on which this gateway configuration should be applied. The scope of
   * label search is restricted to the configuration namespace in which the
   * the resource is present. In other words, the Gateway resource must
   * reside in the same namespace as the gateway workload instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; selector = 2;</code>
   */

  java.lang.String getSelectorOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * REQUIRED: One or more labels that indicate a specific set of pods/VMs
   * on which this gateway configuration should be applied. The scope of
   * label search is restricted to the configuration namespace in which the
   * the resource is present. In other words, the Gateway resource must
   * reside in the same namespace as the gateway workload instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; selector = 2;</code>
   */

  java.lang.String getSelectorOrThrow(
      java.lang.String key);
}
