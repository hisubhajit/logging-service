package com.example.ecom.logging.service;

import com.example.ecom.logging.controller.model.LogModel;
import com.example.ecom.logging.entity.LogEntry;
import com.example.ecom.logging.repositories.LogEntryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Async
public class LogEntryServiceV1 {

    private static Logger log = LoggerFactory.getLogger(LogEntryServiceV1.class);

    @Autowired
    private LogEntryRepository logEntryRepository;

    public void addLogInDB(String message){
        log.debug("Entry: addLogInDB");
        LogEntry logEntry = new LogEntry();
        logEntry.setMessage(message);
        logEntry.setTimeStamp(LocalDateTime.now());
        logEntryRepository.save(logEntry);
    }

    public void addLogInDB(LogModel logModel) {
        LogEntry logEntry = new LogEntry();
        logEntry.setLogLevel(logModel.getLogLevel());
        logEntry.setLoggerName(logModel.getLoggerName());
        logEntry.setApplicationName(logModel.getApplicationName());
        logEntry.setClassName(logModel.getClassName());
        logEntry.setMessage(logModel.getMessage());
        logEntry.setThreadName(logModel.getThreadName());
        logEntry.setTimeStamp(LocalDateTime.now());
        logEntryRepository.save(logEntry);
    }
}
