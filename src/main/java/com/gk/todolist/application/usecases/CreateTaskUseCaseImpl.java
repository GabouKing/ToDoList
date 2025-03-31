package com.gk.todolist.application.usecases;

import com.gk.todolist.adapters.CreateTaskGateway;
import com.gk.todolist.core.dto.CreateTaskDTO;
import com.gk.todolist.core.model.Task;
import com.gk.todolist.core.usecases.CreateTaskUseCase;
import org.springframework.stereotype.Service;

@Service
public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private final CreateTaskGateway createTaskGateway;

    public CreateTaskUseCaseImpl(CreateTaskGateway createTaskGateway) {
        this.createTaskGateway = createTaskGateway;
    }

    @Override
    public Task create(CreateTaskDTO task) {
        return createTaskGateway.create(task);
    }
}
