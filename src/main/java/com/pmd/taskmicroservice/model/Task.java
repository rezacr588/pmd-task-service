package com.pmd.taskmicroservice.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tasks")
public class Task {
  @Id
  private String id;
  private String name;
  private String description;
  private String status;
  private Date startDate;
  private Date endDate;
  private String projectId; // Add this field

  public Task() {
  }

  public Task(String name, String description, String status, Date startDate, Date endDate, String projectId) {
    this.name = name;
    this.description = description;
    this.status = status;
    this.startDate = startDate;
    this.endDate = endDate;
    this.projectId = projectId;
  }

  public Task(String id, String name, String description, String status, Date startDate, Date endDate,
      String projectId) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.status = status;
    this.startDate = startDate;
    this.endDate = endDate;
    this.projectId = projectId;
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  @Override
  public String toString() {
    return "Task [id=" + id + ", name=" + name + ", description=" + description + ", status=" + status + ", startDate="
        + startDate + ", endDate=" + endDate + ", projectId=" + projectId + "]";
  }
}