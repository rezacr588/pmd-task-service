package com.pmd.taskmicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pmd.taskmicroservice.model.Task;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {
}