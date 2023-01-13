package com.hodorcorporation.dummyproject.controller;

import com.hodorcorporation.dummyproject.entity.Dummy;
import com.hodorcorporation.dummyproject.service.DummyService;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/dummy")
@AllArgsConstructor
public class DummyController {

    private final DummyService dummyService;

    @PostMapping
    public ResponseEntity<Dummy> createDummy(@RequestBody Dummy dummy) {
        return status(HttpStatus.CREATED)
                .body(dummyService.createDummy(dummy));
    }

    @GetMapping
    public ResponseEntity<Dummy> getDummyById(@Param("id") Long id) {
        return status(HttpStatus.OK)
                .body(dummyService.getDummyById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Dummy>> getAllDummies() {
        return status(HttpStatus.OK)
                .body(dummyService.getAllDummies());
    }

    @PutMapping
    public ResponseEntity<Dummy> updateDummy(@RequestBody Dummy dummy) {
        return status(HttpStatus.OK)
                .body(dummyService.updateDummy(dummy));
    }

    @DeleteMapping
    public ResponseEntity<Boolean> deleteDummyById(@Param("id") Long id) {
        return status(HttpStatus.NO_CONTENT)
                .body(dummyService.deleteDummyById(id));
    }

}
