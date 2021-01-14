package org.lt.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author LT
 * @Classname OrderController
 * @Description TODO
 * @date 2021/1/13 20:40
 * @Created by LT
 **/
@RestController
@RequestMapping("/order")
public class OrderController {
    /**
     * 通过服务中心的服务名称访问
     * */
    private static String REMOTE_URL = "http://cloud-provider-goods";
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/downOrder/{bookId}")
    public String downOrder(@PathVariable Integer bookId){
        String result = restTemplate.getForObject(REMOTE_URL+"/book/getBooks?bookId="+bookId,String.class);
        return result;
    }

}
