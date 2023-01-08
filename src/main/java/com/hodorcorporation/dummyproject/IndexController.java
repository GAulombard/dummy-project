package com.hodorcorporation.dummyproject;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class IndexController {

    @GetMapping
    public ResponseEntity<String> getIndex() {
        return status(HttpStatus.OK).body("App is running !");
    }

}
