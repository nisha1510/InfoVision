package com.telecom.recharge.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.telecom.recharge.dto.CustomerDTO;

@FeignClient(name = "customer-service", url = "http://localhost:9001")
public interface CustomerClient {
    @GetMapping("/customers/{id}")
    CustomerDTO getCustomerById(@PathVariable Long id);
}
