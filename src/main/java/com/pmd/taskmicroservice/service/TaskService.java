package com.pmd.taskmicroservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmd.taskmicroservice.client.ProjectServiceClient;
import com.pmd.taskmicroservice.dto.TaskDto;
import com.pmd.taskmicroservice.model.Task;
import com.pmd.taskmicroservice.repository.TaskRepository;

@Service
public class TaskService {

  @Autowired
  private TaskRepository taskRepository;

  @Autowired
  private ProjectServiceClient projectServiceClient;

  public List<Task> getAllTasks() {
    return taskRepository.findAll();
  }

  public Task getTaskById(String id) {
    Optional<Task> task = taskRepository.findById(id);
    return task.orElse(null);
  }

  public Task createTask(Task task) {
    Task createdTask = taskRepository.save(task);
    TaskDto taskDto = convertToDto(createdTask);
    projectServiceClient.addTaskToProject(task.getProjectId(), taskDto);
    return createdTask;
  }

  public Task updateTask(String id, Task updatedTask) {
    return taskRepository.findById(id).map(existingTask -> {
      existingTask.setName(updatedTask.getName());
      existingTask.setDescription(updatedTask.getDescription());
      existingTask.setStatus(updatedTask.getStatus());
      existingTask.setStartDate(updatedTask.getStartDate());
      existingTask.setEndDate(updatedTask.getEndDate());
      Task savedTask = taskRepository.save(existingTask);
      TaskDto taskDto = convertToDto(savedTask);
      projectServiceClient.addTaskToProject(savedTask.getProjectId(), taskDto);
      return savedTask;
    }).orElse(null);
  }

  public void deleteTask(String id) {
    taskRepository.deleteById(id);
  }

  private TaskDto convertToDto(Task task) {
    TaskDto taskDto = new TaskDto();
    taskDto.setId(task.getId());
    taskDto.setName(task.getName());
    taskDto.setDescription(task.getDescription());
    taskDto.setStatus(task.getStatus());
    taskDto.setStartDate(task.getStartDate());
    taskDto.setEndDate(task.getEndDate());
    return taskDto;
  }
}