package com.pmd.taskmicroservice.dto;

import java.util.Date;

public class TaskDto {
  private String id;
  private String name;
  private String description;
  private String status;
  private Date startDate;
  private Date endDate;

  public TaskDto() {
  }

  public TaskDto(String name, String description, String status, Date startDate, Date endDate) {
    this.name = name;
    this.description = description;
    this.status = status;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public TaskDto(String id, String name, String description, String status, Date startDate, Date endDate) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.status = status;
    this.startDate = startDate;
    this.endDate = endDate;
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

  @Override
  public String toString() {
    return "TaskDto [id=" + id + ", name=" + name + ", description=" + description + ", status=" + status
        + ", startDate=" + startDate + ", endDate=" + endDate + "]";
  }
}