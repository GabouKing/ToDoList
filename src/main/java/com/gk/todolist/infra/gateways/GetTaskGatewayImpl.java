package com.gk.todolist.infra.gateways;

import com.gk.todolist.adapters.GetTaskGateway;
import com.gk.todolist.core.model.Task;
import com.gk.todolist.infra.model.TaskEntity;
import com.gk.todolist.infra.repository.TaskRepository;
import com.gk.todolist.infra.util.TaskHelper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GetTaskGatewayImpl implements GetTaskGateway {
    private final TaskRepository repository;
    private  final TaskHelper taskHelper;

    public GetTaskGatewayImpl(TaskRepository repository, TaskHelper taskHelper) {
        this.repository = repository;
        this.taskHelper = taskHelper;
    }

    @Override
    public List<Task> getAllTasks() {
        return repository.findAll()
                .stream().map(taskHelper::convertEntityToTask).collect(Collectors.toList());
    }

    @Override
    public Task getTask(Long id) {
        TaskEntity taskEntity = repository.findById(id).orElse(null);
        return taskHelper.convertEntityToTask(taskEntity);
    }
}
