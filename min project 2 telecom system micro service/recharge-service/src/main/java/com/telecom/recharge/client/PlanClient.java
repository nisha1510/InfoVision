package com.telecom.recharge.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.telecom.recharge.dto.PlanDTO;

@FeignClient(name = "plan-service",  url = "http://localhost:9002")
public interface PlanClient {
    @GetMapping("/plans/{id}")
    PlanDTO getPlanById(@PathVariable Long id);
}
