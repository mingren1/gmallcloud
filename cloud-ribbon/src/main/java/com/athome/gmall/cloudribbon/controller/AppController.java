package com.athome.gmall.cloudribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class AppController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://myapplicationname";

    @RequestMapping("index")
    public String index(@RequestParam("id") String id) {

        return restTemplate.getForObject(REST_URL_PREFIX + "/index",String.class);
    }

    @RequestMapping("/add")
    public String add(@RequestParam("id") String id) {

        return restTemplate.postForObject(REST_URL_PREFIX + "/add", id, String.class);
    }
}
