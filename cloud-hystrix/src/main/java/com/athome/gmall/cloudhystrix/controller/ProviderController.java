package com.athome.gmall.cloudhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProviderController {

    @RequestMapping("index")
    @ResponseBody
    @HystrixCommand(fallbackMethod = "indexFallback")
    public String index() {
        return "index";
    }

    public String indexFallback() {
        return "indexFallback";
    }
}
