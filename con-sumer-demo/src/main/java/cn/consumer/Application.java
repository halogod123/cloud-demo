package cn.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@EnableDiscoveryClient
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(42);
//        list.add(52);
//        list.add(7);
//        list.add(48);
//        list.add(99);
//        list.add(5);
//        Collections.sort(list,(a,b) -> a-b);
//
//        System.out.println("list = " + list);

        SpringApplication.run(Application.class,args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        // Do any additional configuration here
        return builder.build();
    }

}
