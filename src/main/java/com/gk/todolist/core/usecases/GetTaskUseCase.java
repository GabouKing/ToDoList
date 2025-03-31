package com.gk.todolist.core.usecases;

import com.gk.todolist.core.model.Task;

import java.util.List;

public interface GetTaskUseCase {
    List<Task> getAllTasks();
    Task getTask(Long id);
}
