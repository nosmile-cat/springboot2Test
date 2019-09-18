package com.ellis.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value(value = "${server.port}")
    private String port;
    @RequestMapping("getTest")
    public String getTest(){

        return "this is test :" + port;
    }
}
