package com.example.demo;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@Data
public class CommonConfig {
    @Value("${common.name}")
    private String name = "Dummy";
    @Value("${common.code}")
    private String code = "001";
    @Value("${user.userName}")
    private String userName = "001";
    @Value("${xxx.cc}")
    private String xxxcc = "001";

    @PostConstruct
    public void postConstruct() {
        log.info("name: {}", name);
        log.info("code: {}", code);
        log.info("userName: {}", userName);
        log.info("xxxcc: {}", xxxcc);
    }
}