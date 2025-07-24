package com.smarttelecom.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.smarttelecom.dto.UsageLogDTO;

@FeignClient(name = "usage-service",url = "http://localhost:9003")
public interface UsageClient {
	
    @GetMapping("/usage/{userId}")
    List<UsageLogDTO> getUsageLogs(@PathVariable String userId);
}