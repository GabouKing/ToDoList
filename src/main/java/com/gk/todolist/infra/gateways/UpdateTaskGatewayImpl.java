package com.gk.todolist.infra.gateways;

import com.gk.todolist.adapters.UpdateTaskGateway;
import com.gk.todolist.core.model.Task;
import com.gk.todolist.infra.model.TaskEntity;
import com.gk.todolist.infra.repository.TaskRepository;
import com.gk.todolist.infra.util.TaskHelper;

public class UpdateTaskGatewayImpl implements UpdateTaskGateway {
    private final TaskRepository taskRepository;
    private final TaskHelper taskHelper;
    public UpdateTaskGatewayImpl(TaskRepository taskRepository, TaskHelper taskHelper) {
        this.taskRepository = taskRepository;
        this.taskHelper = taskHelper;
    }

    @Override
    public Task updateTask(Task task) {
        if ( task == null || task.getId() == null ) {
            //throw exception
            return null;
        }
        TaskEntity entity = taskHelper.convertTaskToEntity(task);
        TaskEntity result = taskRepository.save(entity);
        return taskHelper.convertEntityToTask(result);
    }
}
