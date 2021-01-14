package org.lt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LT
 * @Classname Goods8001
 * @Description TODO
 * @date 2021/1/13 17:05
 * @Created by LT
 **/

@EnableDiscoveryClient //能够让注册中心发现，并扫描到该服务（我们的项目）
@SpringBootApplication
public class Goods8001 {
    public static void main(String[] args) {
        SpringApplication.run(Goods8001.class,args);
    }
}
