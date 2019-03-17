package com.athome.gmall.cloudfeign.client;

import org.springframework.stereotype.Component;

@Component
public class AppClientFallback implements AppClient {
    @Override
    public String index() {

        return null;
    }
}
