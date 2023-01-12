package com.hodorcorporation.dummyproject.service.impl;

import com.hodorcorporation.dummyproject.dto.create.DummyCreateDTO;
import com.hodorcorporation.dummyproject.dto.read.DummyReadDTO;
import com.hodorcorporation.dummyproject.dto.update.DummyUpdateDTO;
import com.hodorcorporation.dummyproject.exception.DummyServiceException;
import com.hodorcorporation.dummyproject.model.Dummy;
import com.hodorcorporation.dummyproject.repository.DummyRepository;
import com.hodorcorporation.dummyproject.service.DummyService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class DummyServiceImpl implements DummyService {

    private final DummyRepository dummyRepository;

    @Override
    public DummyReadDTO createDummy(DummyCreateDTO createDTO) {

        Dummy dummy = dummyRepository.save(Dummy.builder()
                .name(createDTO.getName())
                .build());

        return DummyReadDTO.builder()
                .id(dummy.getId())
                .name(dummy.getName())
                .build();
    }

    @Override
    public DummyReadDTO getDummyById(Long id) {
        Dummy dummy = dummyRepository.findById(id)
                .orElseThrow(() -> new DummyServiceException("Dummy: " + id + "not found"));
        return DummyReadDTO.builder()
                .id(dummy.getId())
                .name(dummy.getName())
                .build();
    }

    @Override
    public List<DummyReadDTO> getAllDummies() {
        return dummyRepository.findAll().stream()
                .map(dummy -> DummyReadDTO.builder()
                        .id(dummy.getId())
                        .name(dummy.getName())
                        .build())
                .toList();
    }

    @Override
    public DummyReadDTO updateDummy(DummyUpdateDTO updateDTO) {
        Long id = updateDTO.getId();
        Dummy dummy = dummyRepository.findById(id)
                .orElseThrow(() -> new DummyServiceException("Dummy: " + id + "not found"));

        dummy.setName(updateDTO.getName());
        dummy = dummyRepository.save(dummy);

        return DummyReadDTO.builder()
                .id(dummy.getId())
                .name(dummy.getName())
                .build();
    }

    @Override
    public void deleteDummyById(Long id) {
        Dummy dummy = dummyRepository.findById(id)
                .orElseThrow(() -> new DummyServiceException("Dummy: " + id + "not found"));

        dummyRepository.delete(dummy);
    }
}
