package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class LegacyPathService {

    public String getLegacyPaths() {
        String configPath = "/etc/app/conf/app.properties";
        String logPath = "/opt/app/logs/app.log";
        return "Config: " + configPath + ", Logs: " + logPath;
    }
}