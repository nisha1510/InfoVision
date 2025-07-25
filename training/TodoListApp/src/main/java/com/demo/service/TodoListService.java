package com.demo.service;

import java.util.List;

import com.demo.entity.TodoList;

public interface TodoListService {
	public List<TodoList> getAll();
    public TodoList add(TodoList todo);
    public TodoList update(Long id, TodoList todo);
    public void delete(Long id);
}
