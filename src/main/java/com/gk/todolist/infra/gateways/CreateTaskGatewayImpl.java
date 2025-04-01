package com.gk.todolist.infra.gateways;

import com.gk.todolist.adapters.CreateTaskGateway;
import com.gk.todolist.core.dto.CreateTaskDTO;
import com.gk.todolist.core.model.Task;

import com.gk.todolist.infra.model.TaskEntity;
import com.gk.todolist.infra.repository.TaskRepository;
import com.gk.todolist.infra.util.TaskHelper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CreateTaskGatewayImpl implements CreateTaskGateway {

    private final TaskRepository taskRepository;
    private final TaskHelper taskHelper;
    public CreateTaskGatewayImpl(TaskRepository taskRepository, TaskHelper taskHelper) {
        this.taskRepository = taskRepository;
        this.taskHelper = taskHelper;
    }

    @Override
    public Task create(CreateTaskDTO task) {
        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setDescription(task.getDescription());
        taskEntity.setCreatedAt(LocalDate.now());
        taskEntity.setTitle(task.getTitle());
        taskEntity.setIsCompleted(task.getIsCompleted());
        TaskEntity result = taskRepository.save(taskEntity);
        return  taskHelper.convertEntityToTask(result);
    }



}
