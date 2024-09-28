package com.example.dto;

import com.example.entities.Student;

public record CountedEnrollmentForStudent(
        Student student,
        Long count
) {
}
