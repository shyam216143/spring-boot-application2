package com.example.spring.service;

import com.example.spring.model.StudentDetails;
import com.example.spring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImplements implements UserService {
    private StudentRepository studentRepository;

    @Autowired
    public ServiceImplements(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void addStudentData(StudentDetails studentDetails){
        studentRepository.save(studentDetails);
    }

    @Override
    public List<String> getStudentData() {
        return studentRepository.allStudentNames();

    }


}
