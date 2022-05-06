package com.example.spring.service;

import com.example.spring.model.StudentDetails;

import java.util.List;

public interface UserService {

    public void addStudentData(StudentDetails studentDetails);

    public List<String> getStudentData();

}