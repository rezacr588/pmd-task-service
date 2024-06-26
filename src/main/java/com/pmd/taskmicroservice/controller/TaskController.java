package com.pmd.taskmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmd.taskmicroservice.model.Task;
import com.pmd.taskmicroservice.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

  @Autowired
  private TaskService taskService;

  @GetMapping
  public List<Task> getAllTasks() {
    return taskService.getAllTasks();
  }

  @GetMapping("/{id}")
  public Task getTaskById(@PathVariable String id) {
    return taskService.getTaskById(id);
  }

  @PostMapping
  public Task createTask(@RequestBody Task task) {
    return taskService.createTask(task);
  }

  @PutMapping("/{id}")
  public Task updateTask(@PathVariable String id, @RequestBody Task task) {
    return taskService.updateTask(id, task);
  }

  @DeleteMapping("/{id}")
  public void deleteTask(@PathVariable String id) {
    taskService.deleteTask(id);
  }
}