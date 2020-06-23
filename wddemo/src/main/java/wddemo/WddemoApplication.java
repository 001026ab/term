package wddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class WddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WddemoApplication.class, args);
    }

}
