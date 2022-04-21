package com.rhryansu.reactspringbootmysql.service;

import com.rhryansu.reactspringbootmysql.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
