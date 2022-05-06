package com.example.spring.repository;

import com.example.spring.model.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentDetails,Long> {

    @Query(value = "SELECT t.student FROM students_details t",nativeQuery = true)
    List<String> allStudentNames();
}
