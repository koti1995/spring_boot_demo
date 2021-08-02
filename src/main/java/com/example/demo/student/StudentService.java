package com.example.demo.student;

import java.time.*;
import java.util.*;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class StudentService {
    @GetMapping
	public List<Student> getStudents() {
		return List.of(
			new Student(123L, "JK", "jk@gmail.com", 25, LocalDate.of(199, 03, 02))
		);
	}
}
