package com.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.model.Course;
import com.course.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	private CourseService courseservice;

	@PostMapping
	public Course createCourse(@RequestBody Course course) {
		return courseservice.create(course);
	}

	@GetMapping
	public List<Course> getAllCourses() {
		return courseservice.readAll();
	}

	@GetMapping("/{id}")
	public Course getCourse(@PathVariable Long id) {
		return courseservice.readById(id).orElseThrow(() -> new RuntimeException("Course not found"));
	}

	@PutMapping("/{id}")
	public Course updateCourse(@PathVariable Long id, @RequestBody Course course) {
		return courseservice.update(id, course);
	}

	@DeleteMapping("/{id}")
	public void deleteCourse(@PathVariable Long id) {
		courseservice.delete(id);
	}

}
