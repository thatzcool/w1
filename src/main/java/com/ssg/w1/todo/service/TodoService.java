package com.ssg.w1.todo.service;

import com.ssg.w1.todo.dto.TodoDTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * packageName   : com.ssg.w1.todo.service
 * fileName      : TodoService
 * author        : a
 * date          : 2025-04-07
 * description   :
 * =================================================
 * DATE             AUTHOR             NOTE
 * -------------------------------------------------
 * 2025-04-07        a
 */
public enum TodoService {
    INSTANCE;

    public void register(TodoDTO todoDTO) {
        System.out.println("DEBUG.........." + todoDTO);
    }

    public List<TodoDTO> getList() {

        List<TodoDTO> todoDTOList = IntStream.range(0, 10).mapToObj(i -> {
            TodoDTO todoDTO = new TodoDTO();
            todoDTO.setTno((long) i);
            todoDTO.setTitle("Todo.." + i);
            todoDTO.setDueDate(LocalDateTime.now());

            return todoDTO;

        }).collect(Collectors.toList());

        return todoDTOList;

    }
}

//enum 타입은 정해진 수만큼 객체를 생성할 수 있다.
