package com.kafka.producer.controller;

import com.kafka.producer.modal.Student;
import com.kafka.producer.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/std")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student create(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
}
