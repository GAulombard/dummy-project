package com.hodorcorporation.dummyproject.controller;

import com.hodorcorporation.dummyproject.dto.create.DummyCreateDTO;
import com.hodorcorporation.dummyproject.dto.read.DummyReadDTO;
import com.hodorcorporation.dummyproject.dto.update.DummyUpdateDTO;
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
    public ResponseEntity<DummyReadDTO> createDummy(@RequestBody DummyCreateDTO createDTO) {
        return status(HttpStatus.CREATED)
                .body(dummyService.createDummy(createDTO));
    }

    @GetMapping
    public ResponseEntity<DummyReadDTO> getDummyById(@Param("id") Long id) {
        return status(HttpStatus.OK)
                .body(dummyService.getDummyById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<DummyReadDTO>> getAllDummies() {
        return status(HttpStatus.OK)
                .body(dummyService.getAllDummies());
    }

    @PutMapping
    public ResponseEntity<DummyReadDTO> updateDummy(@RequestBody DummyUpdateDTO updateDTO) {
        return status(HttpStatus.OK)
                .body(dummyService.updateDummy(updateDTO));
    }

    @DeleteMapping
    public ResponseEntity<Boolean> deleteDummyById(@Param("id") Long id) {
        return status(HttpStatus.NO_CONTENT)
                .body(dummyService.deleteDummyById(id));
    }

}
