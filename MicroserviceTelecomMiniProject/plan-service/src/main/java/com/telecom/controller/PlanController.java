package com.telecom.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.entity.Plan;
import com.telecom.service.PlanService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/plans")
@RequiredArgsConstructor
public class PlanController {

    private final PlanService service;

    @GetMapping
    public List<Plan> getAll() { 
    	return service.getAllPlans(); 
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Plan> getById(@PathVariable(required = true) Long id) {
        Plan plan = service.getById(id);
        return ResponseEntity.ok(plan);
    }


//    @GetMapping("/{id}")
//    public ResponseEntity<Plan> getById(@PathVariable Long id) {
//        return ResponseEntity.ok(service.getById(id));
//    }

    @PostMapping
    public ResponseEntity<Plan> createPlan(@RequestBody Plan plan) {
        Plan created = service.createPlan(plan);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Plan> update(@PathVariable Long id, @RequestBody Plan plan) {
        plan.setId(id);
        return ResponseEntity.ok(service.createPlan(plan));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlan(@PathVariable Long id) {
        service.deletePlan(id);
        return ResponseEntity.noContent().build();
    }
}
