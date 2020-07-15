package com.izdebski.studentlist.student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {

    public List<Student> getAllStudents() {
        return List.of(
                new Student(
                        UUID.randomUUID(),
                        "James",
                        "Bond",
                        "jamesbond@gmail.com",
                        Student.Gender.MALE
                ),
                new Student(
                        UUID.randomUUID(),
                        "Elisa",
                        "Tamara",
                        "elisaTamara@hotmail.com",
                        Student.Gender.FEMALE
                )
        );
    }
}