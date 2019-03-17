package com.athome.gmall.cloudfeign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppClientController {

    @RequestMapping("index")
    public String index() {

        return null;
    }
}
