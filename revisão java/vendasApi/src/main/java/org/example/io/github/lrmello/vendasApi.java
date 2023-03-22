package org.example.io.github.lrmello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class vendasApi {
    public static void main(String[] args){
        SpringApplication.run(vendasApi.class,args);
    }

    @Bean
    public CommandLineRunner initialization(){
        return args -> {
            System.out.println("Hello World");
        };
    }
}
