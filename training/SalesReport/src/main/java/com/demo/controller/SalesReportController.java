package com.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.servie.SalesReportService;

@RestController
@RequestMapping("/api/report")
public class SalesReportController {

    private final SalesReportService service;

    public SalesReportController(SalesReportService service) {
        this.service = service;
    }

    @GetMapping("/high-selling")
    public List<Map<String, Object>> getReport() {
        List<Object[]> results = service.getHighSellingProducts();

        List<Map<String, Object>> report = new ArrayList<>();
        for (Object[] row : results) {
            Map<String, Object> product = new HashMap<>();
            product.put("productId", row[0]);
            product.put("name", row[1]);
            product.put("totalSales", row[2]);
            report.add(product);
        }
        return report;
    }
}
