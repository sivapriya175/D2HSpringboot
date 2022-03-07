package com.example.myproject.repository;

import com.example.myproject.entity.Premium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PremiumRepository extends JpaRepository<Premium,Integer> {
}
