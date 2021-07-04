package com.example.creahanamvn;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CreahanaMvnApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreahanaMvnApplication.class, args);
    }

    @Bean //agregar
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
