package com.dirkficial.task.mapper;

import com.dirkficial.task.domain.CreateTaskRequest;
import com.dirkficial.task.domain.UpdateTaskRequest;
import com.dirkficial.task.domain.dto.CreateTaskRequestDto;
import com.dirkficial.task.domain.dto.TaskDto;
import com.dirkficial.task.domain.dto.UpdateTaskRequestDto;
import com.dirkficial.task.domain.entity.Task;

public interface TaskMapper {

    CreateTaskRequest fromDto(CreateTaskRequestDto dto);

    UpdateTaskRequest fromDto(UpdateTaskRequestDto dto);

    TaskDto toDto(Task task);
}
