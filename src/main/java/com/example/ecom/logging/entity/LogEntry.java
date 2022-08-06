package com.example.ecom.logging.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class LogEntry {

    @Id
    @GeneratedValue
    private Long logId;
    private LocalDateTime timeStamp;
    private String message;
}
