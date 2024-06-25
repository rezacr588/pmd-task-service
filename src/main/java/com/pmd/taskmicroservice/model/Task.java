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

  // Default Constructor
  public Task() {
  }

  // Parameterized Constructor
  public Task(String name, String description, String status, Date startDate, Date endDate) {
    this.name = name;
    this.description = description;
    this.status = status;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  // Getters and Setters
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
}