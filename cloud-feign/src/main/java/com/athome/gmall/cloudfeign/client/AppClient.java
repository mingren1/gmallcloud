package com.athome.gmall.cloudfeign.client;

import com.athome.gmall.cloudfeign.config.AppClientConfiger;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(name = "serviceApplicationName",
            url = "localhost:8080",
            fallback = AppClientFallback.class,
            configuration = AppClientConfiger.class)
public interface AppClient {

    @RequestMapping("index")
    public String index();
}
