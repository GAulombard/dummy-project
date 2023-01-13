package com.hodorcorporation.dummyproject.service;

import com.hodorcorporation.dummyproject.dto.create.DummyCreateDTO;
import com.hodorcorporation.dummyproject.dto.read.DummyReadDTO;
import com.hodorcorporation.dummyproject.dto.update.DummyUpdateDTO;

import java.util.List;

public interface DummyService {

    DummyReadDTO createDummy(DummyCreateDTO createDTO);

    DummyReadDTO getDummyById(Long id);

    List<DummyReadDTO> getAllDummies();

    DummyReadDTO updateDummy(DummyUpdateDTO updateDTO);

    Boolean deleteDummyById(Long id);


}
