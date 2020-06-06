package cn.consumer.controller;

import cn.consumer.pojo.User;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.ServiceInstanceChooser;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private DiscoveryClient discoveryClient;

//    @Autowired
//    private RibbonLoadBalancerClient client;

    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Long id){
        // 根据服务id获取实例
//        List<ServiceInstance> instances = discoveryClient.getInstances("USER-SERVICE");


//        String ip = instances.get(0).getHost();
//        Integer port = instances.get(0).getPort();
//        String url = "http://"+ ip +":"+ port +"/getUser?id=" + id;
//        System.out.println("url = " + url);


        // 从实例中选择，负载均衡
        // 随机，轮询，hash
//        ServiceInstance instance = client.choose("USER-SERVICE");
        String url = "http://USER-SERVICE/getUser?id=" + id;
        User user = restTemplate.getForObject(url,User.class);
        return user;
    }



}
