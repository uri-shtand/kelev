package com.shtand.kelev.services;

import com.shtand.kelev.actions.JavaProcessLauncher;
import com.shtand.kelev.objects.ProcessContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActionExecutionService {
    private final ContextService contextService;

    @Autowired
    public ActionExecutionService(ContextService contextService) {
        this.contextService = contextService;
    }

    public void executeStartupActions() {
        launchProcess();
        //TODO - we need a more sophisticated approach to actions
        //TODO
    }

    private void launchProcess() {
        ProcessContext processContext = contextService.getProcessContext();
        JavaProcessLauncher javaProcessLauncher = new JavaProcessLauncher();
        javaProcessLauncher.launchProcess(processContext);
    }
}
