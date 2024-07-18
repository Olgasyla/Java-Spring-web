package org.example.halloworldspring;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Data
public class HalloWorldSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(HalloWorldSpringApplication.class, args);
    }

}
