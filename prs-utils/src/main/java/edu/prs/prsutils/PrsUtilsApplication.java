package edu.prs.prsutils;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "edu.prs.prsutils.Mapper")
public class PrsUtilsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrsUtilsApplication.class, args);
    }

}
