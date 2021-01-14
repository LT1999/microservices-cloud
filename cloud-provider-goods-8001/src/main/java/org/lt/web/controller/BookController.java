package org.lt.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LT
 * @Classname BookController
 * @Description TODO
 * @date 2021/1/13 17:10
 * @Created by LT
 **/

@RestController
@RequestMapping("/book")
public class BookController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getBooks")
    public Object getBooks(@RequestParam String bookId) {
        return "{\"bookId\":"+bookId+",\"bookName\":\"西游记\",\"serverPort\":"+serverPort+"}";
    }

}
