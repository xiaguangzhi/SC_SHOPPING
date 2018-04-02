package com.iotek.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xiaohuang on 2018/3/31.
 * ----------------The heart withered--------
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping(value = "/hello-consumer")
    public  String  consumerHello(){
        return  restTemplate.getForEntity("http://provider-service/v1/hello/hello.view",String.class).getBody();

    }


}
