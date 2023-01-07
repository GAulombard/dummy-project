package com.hodorcorporation.dummyproject;

import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/dummy")
@AllArgsConstructor
public class DummyController {

    private final DummyRepository dummyRepository;

    @PostMapping
    public ResponseEntity<Dummy> create(@RequestBody Dummy dummy) {
        return status(HttpStatus.CREATED).body(dummyRepository.save(dummy));
    }

    @GetMapping
    public ResponseEntity<Dummy> read(@Param("id") Long id) {
        return status(HttpStatus.OK).body(dummyRepository.findById(id)
                .orElseThrow());
    }

    @PutMapping
    public ResponseEntity<Dummy> update(@RequestBody Dummy dummy) {
        dummyRepository.findById(dummy.getId())
                .orElseThrow();
        return status(HttpStatus.OK).body(dummyRepository.save(dummy));
    }

    @DeleteMapping
    public ResponseEntity<Boolean> delete(@Param("id") Long id) {
        Dummy dummy = dummyRepository.findById(id)
                .orElseThrow();
        dummyRepository.delete(dummy);
        return status(HttpStatus.OK).body(true);
    }

}
