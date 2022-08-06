package com.example.ecom.logging.controller.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogModel {
    private String message;
    private String applicationName;
    private String logLevel;
    private String threadName;
    private String className;
    private String loggerName;
}
