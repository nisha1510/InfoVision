package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.TodoList;
import com.demo.service.TodoListService;

@RestController
@RequestMapping("/api/todos")
public class TodoListController {
	@Autowired
	private TodoListService toDoService;

	@PostMapping
	public ResponseEntity<TodoList> createToDo(@RequestBody TodoList toDos) {
		TodoList saved = toDoService.add(toDos);
		return ResponseEntity.ok(saved);
	}

	@GetMapping
	public ResponseEntity<List<TodoList>> getAllTodos() {
		return ResponseEntity.ok(toDoService.getAll());
	}

	@PutMapping("/{id}")
	public ResponseEntity<TodoList> updateToDo(@PathVariable Long id, @RequestBody TodoList toDo) {
		TodoList updatedToDo = toDoService.update(id, toDo);
		return ResponseEntity.ok(updatedToDo);
	}

	@DeleteMapping("/{id}")
	public void deleteToDo(@PathVariable Long id) {
		toDoService.delete(id);
	}
}
