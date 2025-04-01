package com.gk.todolist.controller;

import com.gk.todolist.adapters.CreateTaskGateway;
import com.gk.todolist.adapters.DeleteTaskGateway;
import com.gk.todolist.adapters.GetTaskGateway;
import com.gk.todolist.adapters.UpdateTaskGateway;
import com.gk.todolist.core.dto.CreateTaskDTO;
import com.gk.todolist.core.model.Task;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class ToDoListController {

    private final CreateTaskGateway createTaskGateway;
    private final DeleteTaskGateway deleteTaskGateway;
    private final UpdateTaskGateway updateTaskGateway;
    private final GetTaskGateway getTaskGateway;

    public ToDoListController(CreateTaskGateway createTaskGateway, DeleteTaskGateway deleteTaskGateway, UpdateTaskGateway updateTaskGateway, GetTaskGateway getTaskGateway) {
        this.createTaskGateway = createTaskGateway;
        this.deleteTaskGateway = deleteTaskGateway;
        this.updateTaskGateway = updateTaskGateway;
        this.getTaskGateway = getTaskGateway;
    }

    @GetMapping
    public ResponseEntity<List<Task>> getTasks() {
        return ResponseEntity.ok(getTaskGateway.getAllTasks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTask(@PathVariable Long id) {
        return ResponseEntity.ok(getTaskGateway.getTask(id));
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody CreateTaskDTO task) {
        return new ResponseEntity<>(createTaskGateway.create(task), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteTask(@PathVariable Long id) {
        deleteTaskGateway.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<Task> updateTask(@RequestBody Task task) {
        return new ResponseEntity<>(updateTaskGateway.updateTask(task), HttpStatus.OK);
    }
}
