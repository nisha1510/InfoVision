package com.smarttelecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smarttelecom.dto.BillDTO;
import com.smarttelecom.service.BillingService;

@RestController
@RequestMapping("/billing")
public class BillingController {
	@Autowired 
	private BillingService service;

    @PostMapping("/generate/{userId}")
    public ResponseEntity<BillDTO> generate(@PathVariable String userId) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.generateBill(userId));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<BillDTO>> getBills(@PathVariable String userId) {
        return ResponseEntity.ok(service.getBills(userId));
    }
}
