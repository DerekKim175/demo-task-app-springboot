package com.dirkficial.task.domain;

import com.dirkficial.task.domain.entity.TaskPriority;
import com.dirkficial.task.domain.entity.TaskStatus;

import java.time.LocalDate;

public record UpdateTaskRequest(
        String title,
        String description,
        LocalDate dueDate,
        TaskStatus status,
        TaskPriority priority
) {
}
