package com.gk.todolist.application.usecases;

import com.gk.todolist.adapters.DeleteTaskGateway;
import com.gk.todolist.core.usecases.DeleteTaskUseCase;

public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {
    private final DeleteTaskGateway deleteTaskGateway;

    public DeleteTaskUseCaseImpl(DeleteTaskGateway deleteTaskGateway) {
        this.deleteTaskGateway = deleteTaskGateway;
    }

    @Override
    public void delete(Long id) {
        deleteTaskGateway.delete(id);
    }
}
