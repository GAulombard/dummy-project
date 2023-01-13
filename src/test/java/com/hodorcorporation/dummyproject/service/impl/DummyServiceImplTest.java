package com.hodorcorporation.dummyproject.service.impl;

import com.hodorcorporation.dummyproject.entity.Dummy;
import com.hodorcorporation.dummyproject.exception.DummyServiceException;
import com.hodorcorporation.dummyproject.repository.DummyRepository;
import com.hodorcorporation.dummyproject.service.DummyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DummyServiceImplTest {

    @Mock private DummyRepository dummyRepository;

    private DummyService dummyService;

    @BeforeEach
    void setUp() {
        dummyService = new DummyServiceImpl(dummyRepository);
    }

    @Test
    void createDummy() {
        // given
        Dummy dummy = new Dummy();
        dummy.setId(1L);
        dummy.setName("hodor");

        // when
        dummyService.createDummy(dummy);

        // then
        verify(dummyRepository).save(any());

    }

    @Test
    void getDummyById() {
        // given
        Dummy dummy = new Dummy(1L,"hodor");
        given(dummyRepository.findById(anyLong())).willReturn(Optional.of(dummy));

        // when
        dummyService.getDummyById(1L);

        // then
        verify(dummyRepository).findById(anyLong());

    }

    @Test
    void getDummyById_shouldThrowException() {
        // given
        Long id = 1L;
        given(dummyRepository.findById(id)).willReturn(Optional.empty());

        // when
        // then
        assertThatThrownBy(() -> dummyService.getDummyById(id))
                .isInstanceOf(DummyServiceException.class);

    }

    @Test
    void getAllDummies() {
        // given
        // when
        dummyService.getAllDummies();

        // then
        verify(dummyRepository).findAll();
    }

    @Test
    void updateDummy() {
        // given
        Dummy dummy = new Dummy(1L,"hodor");
        given(dummyRepository.findById(anyLong())).willReturn(Optional.of(dummy));
        given(dummyRepository.save(any(Dummy.class))).willReturn(mock(Dummy.class));

        // when
        dummyService.updateDummy(dummy);

        // then
        verify(dummyRepository).save(any());

    }

    @Test
    void deleteDummyById() {
        // given
        Dummy dummy = new Dummy(1L,"hodor");
        given(dummyRepository.findById(anyLong())).willReturn(Optional.of(dummy));

        // when
        dummyService.deleteDummyById(1L);

        // then
        verify(dummyRepository).delete(dummy);
    }

    @Test
    void deleteDummyById_shouldThrowException() {
        // given
        Long id = 1L;
        given(dummyRepository.findById(id)).willReturn(Optional.empty());

        // when
        // then
        assertThatThrownBy(() -> dummyService.deleteDummyById(id))
                .isInstanceOf(DummyServiceException.class)
                .hasMessageContaining("Dummy: "+id+" not found");

        verify(dummyRepository,never()).delete(any(Dummy.class));
    }
}