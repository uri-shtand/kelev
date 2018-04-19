package com.shtand.kelev.services;

import com.shtand.kelev.objects.Context;
import com.shtand.kelev.objects.ProcessContext;
import org.springframework.stereotype.Service;

@Service
public class ContextService {
    private final Context context;

    public ContextService() {
        context = new Context();
    }

    public ProcessContext getProcessContext() {
        return context.getProcessContext();
    }
}
