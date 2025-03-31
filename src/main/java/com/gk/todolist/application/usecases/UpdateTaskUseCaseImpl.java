package com.gk.todolist.application.usecases;

import com.gk.todolist.adapters.UpdateTaskGateway;
import com.gk.todolist.core.model.Task;
import com.gk.todolist.core.usecases.UpdateTaskUseCase;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {
    private final UpdateTaskGateway updateTaskGateway;

    public UpdateTaskUseCaseImpl(UpdateTaskGateway updateTaskGateway) {
        this.updateTaskGateway = updateTaskGateway;
    }

    @Override
    public Task updateTask(Task task) {
        return updateTaskGateway.updateTask(task);
    }
}
