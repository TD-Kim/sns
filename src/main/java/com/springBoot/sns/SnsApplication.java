package com.springBoot.sns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

public class SnsApplication {
    // Ctrl + Alt + L : 코드 정렬
    public static void main(String[] args) {
        SpringApplication.run(SnsApplication.class, args);
    }
}
