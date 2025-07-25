package com.telecom.recharge.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "recharge")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recharge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;
    private Long planId;
    private LocalDateTime timestamp;
}
