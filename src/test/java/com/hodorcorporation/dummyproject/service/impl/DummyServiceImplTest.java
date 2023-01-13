package com.hodorcorporation.dummyproject.service.impl;

import com.hodorcorporation.dummyproject.dto.create.DummyCreateDTO;
import com.hodorcorporation.dummyproject.dto.read.DummyReadDTO;
import com.hodorcorporation.dummyproject.repository.DummyRepository;
import com.hodorcorporation.dummyproject.service.DummyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class DummyServiceImplTest {

    @Mock
    private DummyRepository dummyRepository;
    private DummyService dummyService;

    @BeforeEach
    void setUp() {
        dummyService = new DummyServiceImpl(dummyRepository);
    }

    @Test
    void createDummy() {
        //given
        DummyCreateDTO createDTO = new DummyCreateDTO("hodor");

        //when
        DummyReadDTO readDTO = dummyService.createDummy(createDTO);

        //then
        verify(dummyRepository).save(any());

    }

    @Test
    void getDummyById() {
    }

    @Test
    void getAllDummies() {
    }

    @Test
    void updateDummy() {
    }

    @Test
    void deleteDummyById() {
    }
}