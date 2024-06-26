package com.pmd.taskmicroservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pmd.taskmicroservice.dto.ProjectDto;
import com.pmd.taskmicroservice.dto.TaskDto;

@FeignClient(name = "project-service")
public interface ProjectServiceClient {

  @PostMapping("/projects/{projectId}/tasks")
  void addTaskToProject(@PathVariable("projectId") String projectId, @RequestBody TaskDto taskDto);

  @GetMapping("/projects/{projectId}")
  ProjectDto getProjectById(@PathVariable("projectId") String projectId);
}