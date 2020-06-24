package xiuqin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication  //1.加这个注解，主启动注解
@EnableDiscoveryClient
public class StudentMain {
    public static void main(String[] args) {
        SpringApplication.run(StudentMain.class,args);//再加上这句，创建主启动就成功啦
    }
}
