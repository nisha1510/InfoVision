package com.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.entity.TodoList;
import com.demo.repository.TodoListRepository;
import com.demo.service.TodoListService;

import userException.ToDoNotFoundException;

public class TodoListServiceImpl implements TodoListService {
   
	@Autowired
    private TodoListRepository repository;

    @Override
    public List<TodoList> getAll() {
        return repository.findAll();
    }

    @Override
    public TodoList add(TodoList todo) {
        return repository.save(todo);
    }

    @Override
    public TodoList update(Long id, TodoList updatedTodo) {
        return repository.findById(id).map(todo -> {
            todo.setTitle(updatedTodo.getTitle());
            todo.setCompleted(updatedTodo.isCompleted());
            return repository.save(todo);
        }).orElseThrow(() -> new ToDoNotFoundException("Todo not found with id " + id));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}