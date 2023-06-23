package com.javaguides.springboot.controller;

import com.javaguides.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent() {
        return new Student(
                1,
                "Sebastian",
                "Adrover"
        );
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Sebastian","Adrover"));
        students.add(new Student(2,"Santiago","Rossi"));
        students.add(new Student(3,"Maria","Rossi"));
        students.add(new Student(4,"Joaquin","Adrover"));

        return students;
    }
}
