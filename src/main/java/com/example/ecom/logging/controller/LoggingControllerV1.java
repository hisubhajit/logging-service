package com.example.ecom.logging.controller;

import com.example.ecom.logging.controller.model.LogModel;
import com.example.ecom.logging.service.LogEntryServiceV1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("rest/v1/log")
public class LoggingControllerV1 {

    private static Logger logger  = LoggerFactory.getLogger(LoggingControllerV1.class);

    @Autowired
    private LogEntryServiceV1 logEntryServiceV1;

    @PostMapping("/entry")
    ResponseEntity<String> logEntry(@RequestBody LogModel logModel){
        logger.info("Entry: LoggingControllerV1");
        logEntryServiceV1.addLogInDB(logModel.getMessage());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Log is accepted to add in DB"+ LocalDateTime.now());
    }
}
