package com.hodorcorporation.dummyproject.service.impl;

import com.hodorcorporation.dummyproject.entity.Dummy;
import com.hodorcorporation.dummyproject.exception.DummyServiceException;
import com.hodorcorporation.dummyproject.repository.DummyRepository;
import com.hodorcorporation.dummyproject.service.DummyService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class DummyServiceImpl implements DummyService {

    private static final String NOT_FOUND = "Dummy: {0} not found";
    private final DummyRepository dummyRepository;

    @Override
    public Dummy createDummy(Dummy dummy) {
        return dummyRepository.save(dummy);
    }

    @Override
    public Dummy getDummyById(Long id) {
        return dummyRepository.findById(id)
                .orElseThrow(() -> new DummyServiceException(MessageFormat.format(NOT_FOUND, id)));
    }

    @Override
    public List<Dummy> getAllDummies() {
        return dummyRepository.findAll();
    }

    @Override
    public Dummy updateDummy(Dummy updateDTO) {
        Long id = updateDTO.getId();
        Dummy dummy = dummyRepository.findById(id)
                .orElseThrow(() -> new DummyServiceException(MessageFormat.format(NOT_FOUND, id)));

        dummy.setName(updateDTO.getName());

        return dummyRepository.save(dummy);
    }

    @Override
    public Boolean deleteDummyById(Long id) {
        Dummy dummy = dummyRepository.findById(id)
                .orElseThrow(() -> new DummyServiceException(MessageFormat.format(NOT_FOUND, id)));
        dummyRepository.delete(dummy);
        return true;
    }
}
