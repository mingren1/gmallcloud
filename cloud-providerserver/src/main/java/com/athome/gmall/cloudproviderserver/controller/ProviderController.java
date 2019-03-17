package com.athome.gmall.cloudproviderserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProviderController {

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "index";
    }
}
