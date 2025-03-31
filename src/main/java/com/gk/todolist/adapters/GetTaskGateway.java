package com.gk.todolist.adapters;

import com.gk.todolist.core.model.Task;

import java.util.List;

public interface GetTaskGateway {
    List<Task> getAllTasks();
    Task getTask(Long id);
}
