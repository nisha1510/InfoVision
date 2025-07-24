package com.smarttelecom.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.smarttelecom.dto.PlanDTO;

@FeignClient(name = "plan-service",  url = "http://localhost:9001")
public interface PlanClient {

    @GetMapping("/plans/{id}")
    PlanDTO getPlanById(@PathVariable("id") String id);
}
