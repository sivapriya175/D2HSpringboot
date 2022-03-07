package com.example.myproject.repository;

import com.example.myproject.entity.Addon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AddonRepository extends JpaRepository<Addon,Integer> {
}
