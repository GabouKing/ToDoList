package com.gk.todolist.core.usecases;

import com.gk.todolist.core.dto.CreateTaskDTO;
import com.gk.todolist.core.model.Task;

public interface CreateTaskUseCase {
    Task create(CreateTaskDTO task);
}
