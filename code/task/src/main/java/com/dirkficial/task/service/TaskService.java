package com.dirkficial.task.service;

import com.dirkficial.task.domain.CreateTaskRequest;
import com.dirkficial.task.domain.UpdateTaskRequest;
import com.dirkficial.task.domain.entity.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {

    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();

    Task updateTask(UUID taskId, UpdateTaskRequest request);
}
