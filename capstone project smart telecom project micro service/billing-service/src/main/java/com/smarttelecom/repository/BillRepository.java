package com.smarttelecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smarttelecom.entity.Bill;

public interface BillRepository extends JpaRepository<Bill, String> {
    List<Bill> findByUserId(String userId);

}
