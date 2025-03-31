package com.gk.todolist.infra.util;

import com.gk.todolist.core.model.Task;
import com.gk.todolist.infra.model.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskHelper {
    public Task convertEntityToTask(TaskEntity entity) {
        if (entity == null) return null;
        return new Task(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                entity.isCompleted(),
                entity.getCreatedAt()
        );
    }

    public TaskEntity convertTaskToEntity(Task task) {
        if (task == null) return null;
        return new TaskEntity(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.isCompleted(),
                task.getCreatedAt()
        );
    }
}
