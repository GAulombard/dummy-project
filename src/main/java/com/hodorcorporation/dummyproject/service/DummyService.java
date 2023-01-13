package com.hodorcorporation.dummyproject.service;

import com.hodorcorporation.dummyproject.entity.Dummy;

import java.util.List;

public interface DummyService {

    Dummy createDummy(Dummy dummy);

    Dummy getDummyById(Long id);

    List<Dummy> getAllDummies();

    Dummy updateDummy(Dummy dummy);

    Boolean deleteDummyById(Long id);


}
