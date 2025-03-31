package com.gk.todolist.adapters;

import com.gk.todolist.core.dto.CreateTaskDTO;
import com.gk.todolist.core.model.Task;

public interface CreateTaskGateway {
    Task create(CreateTaskDTO task);
}
