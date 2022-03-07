package com.example.myproject.repository;

import com.example.myproject.entity.Monthly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthlyRepository extends JpaRepository<Monthly,Integer> {
}
