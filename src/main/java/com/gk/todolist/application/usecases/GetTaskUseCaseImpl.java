package com.gk.todolist.application.usecases;

import com.gk.todolist.adapters.GetTaskGateway;
import com.gk.todolist.core.model.Task;
import com.gk.todolist.core.usecases.GetTaskUseCase;

import java.util.List;

public class GetTaskUseCaseImpl implements GetTaskUseCase {
    private final GetTaskGateway getTaskGateway;

    public GetTaskUseCaseImpl(GetTaskGateway getTaskGateway) {
        this.getTaskGateway = getTaskGateway;
    }

    @Override
    public List<Task> getAllTasks() {
        return getTaskGateway.getAllTasks();
    }

    @Override
    public Task getTask(Long id) {
        return getTaskGateway.getTask(id);
    }
}
