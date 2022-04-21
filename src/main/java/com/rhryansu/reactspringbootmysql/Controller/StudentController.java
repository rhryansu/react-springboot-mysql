package com.rhryansu.reactspringbootmysql.Controller;

import com.rhryansu.reactspringbootmysql.model.Student;
import com.rhryansu.reactspringbootmysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "New Student Added";
    }

    @GetMapping(value = "/getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
