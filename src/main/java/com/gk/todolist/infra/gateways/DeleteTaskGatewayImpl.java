package com.gk.todolist.infra.gateways;

import com.gk.todolist.adapters.DeleteTaskGateway;
import com.gk.todolist.core.model.Task;
import com.gk.todolist.infra.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteTaskGatewayImpl implements DeleteTaskGateway {

    private TaskRepository repository;
    public DeleteTaskGatewayImpl(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
