package com.hodorcorporation.dummyproject;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.status;

@SpringBootApplication

public class DummyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DummyProjectApplication.class, args);
    }


}
