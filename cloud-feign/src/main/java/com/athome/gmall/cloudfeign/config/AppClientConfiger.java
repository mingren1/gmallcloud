package com.athome.gmall.cloudfeign.config;

import feign.Contract;
import feign.Feign;
import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppClientConfiger {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("user", "password");
    }

    /*
    Feign Hystrix支持
如果Hystrix在类路径和feign.hystrix.enabled=true上，则Feign将使用断路器包装所有方法。
还可以返回com.netflix.hystrix.HystrixCommand。
这样可以使用无效模式（调用.toObservable()或.observe()或异步使用（调用.queue()））。
     */
    @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }

    /*
        NONE，无记录（DEFAULT）。
        BASIC，只记录请求方法和URL以及响应状态代码和执行时间。
        HEADERS，记录基本信息以及请求和响应头。
        FULL，记录请求和响应的头文件，正文和元数据。
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
