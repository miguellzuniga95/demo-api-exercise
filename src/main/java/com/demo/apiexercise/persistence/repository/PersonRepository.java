package com.demo.apiexercise.persistence.repository;

import com.demo.apiexercise.persistence.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Position, Integer> {
}
