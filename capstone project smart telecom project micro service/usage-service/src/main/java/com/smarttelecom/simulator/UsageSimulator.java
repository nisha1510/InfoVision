package com.smarttelecom.simulator;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.smarttelecom.client.UserClient;
import com.smarttelecom.dto.UsageLogDTO;
import com.smarttelecom.dto.UserDTO;
import com.smarttelecom.serviceImpl.UsageLogServiceImpl;

import jakarta.annotation.PostConstruct;

@Component
public class UsageSimulator {

    @Autowired 
    private UsageLogServiceImpl usageService;
    
    @Autowired 
    private UserClient userClient;
    
    @PostConstruct
    public void simulateOnceOnStartup() {
        List<UserDTO> users = userClient.getAllUsers();

        for (UserDTO user : users) {
            UsageLogDTO log = new UsageLogDTO();
            log.setUserId(user.getId());
            log.setDate(LocalDate.now());
            log.setCallDuration(new Random().nextInt(60));
            log.setDataUsed(new Random().nextDouble() * 500);
            log.setSmsCount(new Random().nextInt(20));

            usageService.saveLog(log);
            System.out.println("Simulated usage for user: " + user.getId());
        }
    }

//    @PostConstruct
//    public void startSimulation() {
//        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
//
//        executor.scheduleAtFixedRate(() -> {
//            List<UserDTO> users = userClient.getAllUsers();
//
//            for (UserDTO user : users) {
//                UsageLogDTO log = new UsageLogDTO();
//                log.setUserId(user.getId());
//                log.setDate(LocalDate.now());
//                log.setCallDuration(new Random().nextInt(60));
//                log.setDataUsed(new Random().nextDouble() * 500);
//                log.setSmsCount(new Random().nextInt(20));
//
//                usageService.saveLog(log);
//                System.out.println("Simulated usage for user: " + user.getId());
//            }
//
//        }, 5, 60, TimeUnit.SECONDS);
//    }
}
