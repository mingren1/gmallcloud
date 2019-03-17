package com.athome.gmall.cloudfeign.controller;

import feign.Client;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;

@Import(FeignClientsConfiguration.class)
public class FooController {
    private FooClient fooClient;

    private FooClient adminClient;

    /*
    在某些情况下，可能需要以上述方法不可能自定义您的Feign客户端。在这种情况下，您可以使用Feign Builder API创建客户端 。
下面是一个创建两个具有相同接口的Feign客户端的示例，但是使用单独的请求拦截器配置每个客户端。
     */
    @Autowired
    public FooController(
            Decoder decoder, Encoder encoder, Client client) {
        this.fooClient = Feign.builder().client(client)
                .encoder(encoder)
                .decoder(decoder)
                .requestInterceptor(new BasicAuthRequestInterceptor("user", "user"))
                .target(FooClient.class, "http://PROD-SVC");
        this.adminClient = Feign.builder().client(client)
                .encoder(encoder)
                .decoder(decoder)
                .requestInterceptor(new BasicAuthRequestInterceptor("admin", "admin"))
                .target(FooClient.class, "http://PROD-SVC");
    }
}
/*
在上面的例子中，FeignClientsConfiguration.class是由Spring Cloud Netflix提供的默认配置。
注意
	PROD-SVC是客户端将要求的服务的名称。
 */
