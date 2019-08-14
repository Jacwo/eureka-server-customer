package com.yyl.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * author:yangyuanliang Date:2019-08-14 Time:17:39
 **/
@RestController
public class CustomerController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/customer",method = RequestMethod.GET)
    public String helloCustomer(){
        return restTemplate.getForEntity("http://hello-service/hello",String.class).getBody();
    }
}
