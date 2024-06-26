package com.pmd.taskmicroservice.dto;

import java.util.List;

public class ProjectDto {
  private String id;
  private String name;
  private List<TaskDto> tasks;

  public ProjectDto() {
  }

  public ProjectDto(String id, String name, List<TaskDto> tasks) {
    this.id = id;
    this.name = name;
    this.tasks = tasks;
  }

  // Getters and setters
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<TaskDto> getTasks() {
    return tasks;
  }

  public void setTasks(List<TaskDto> tasks) {
    this.tasks = tasks;
  }

  @Override
  public String toString() {
    return "ProjectDto [id=" + id + ", name=" + name + ", tasks=" + tasks + "]";
  }
}