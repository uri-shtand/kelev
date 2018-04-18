package com.shtand.kelev;

import com.shtand.kelev.actions.JavaProcessLauncher;
import com.shtand.kelev.services.ActionExecutionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KelevApplication {


    private final ActionExecutionService actionExecutionService;


    public static void main(String[] args) {
        SpringApplication.run(KelevApplication.class, args);
    }

    public KelevApplication(ActionExecutionService actionExecutionService) {
        this.actionExecutionService = actionExecutionService;
        actionExecutionService.executeStartupActions();
    }
}
