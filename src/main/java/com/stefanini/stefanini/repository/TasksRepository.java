package com.stefanini.stefanini.repository;

import com.stefanini.stefanini.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository<Task, Integer> {
}
