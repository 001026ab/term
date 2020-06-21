package com.zsw.pingjiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PingjiaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PingjiaoApplication.class, args);
    }

}
