package com.course.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.model.Course;
import com.course.repository.CourseRepository;


@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courserepo;
	
	public Course create(Course course) {
		return courserepo.save(course);
	}
	
	public List<Course> readAll(){
		return courserepo.findAll();
	}
	
	public Optional<Course> readById(Long id) {
        return courserepo.findById(id);
    }
	
	public Course update(Long id, Course updatedCourse) {
        return courserepo.findById(id).map(course -> {
        	course.setName(updatedCourse.getName());
        	return courserepo.save(course);
        }).orElseThrow(()-> new RuntimeException("Course not found"));
    }
	
	public void delete(Long id) {
        courserepo.deleteById(id);
    }
}
