package org.lt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LT
 * @Classname OrderApp8001
 * @Description TODO
 * @date 2021/1/13 20:40
 * @Created by LT
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderApp8001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderApp8001.class,args);
    }
}
