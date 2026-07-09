package com.systemhealthmonitor.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/api/health")
    public Map<String, String> getHeath() {
        return Map.of("status", "UP",
                "memory", Runtime.getRuntime().freeMemory() + " bytes free"
        );
    }
}
