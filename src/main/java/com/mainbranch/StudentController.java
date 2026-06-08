package com.mainbranch;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    static List<Student> students = new ArrayList<>();

    static {
        Student student1 = new Student();
        student1.setId(1L);
        student1.setName("John");
        student1.setEmail("john@example.com");
        students.add(student1);

        Student student2 = new Student();
        student2.setName("Nick");
        student2.setId(2L);
        student2.setEmail("nick@example.com");
        students.add(student2);

        Student student3 = new Student();
        student3.setName("Bob");
        student3.setId(3L);
        student3.setEmail("bob@example.com");
        students.add(student3);
    }

    @GetMapping
    public List<Student> getAll() {
        return students;
    }

    @GetMapping("/id/{id:\\d+}")
    public Student getById(@PathVariable Long id) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @GetMapping("/name/{name:[a-zA-Z]+}")
    public Student getByName(@PathVariable String name) {
        return students.stream()
                .filter(student -> student.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
