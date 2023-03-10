package com.hodorcorporation.dummyproject.repository;

import com.hodorcorporation.dummyproject.entity.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepository extends JpaRepository<Dummy, Long> {
}