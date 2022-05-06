package com.example.spring.controller;

import com.example.spring.model.StudentDetails;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/StudentData")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    //http methods
    @PostMapping(produces = "application/json", value = "/addStudentDetails")
    public ResponseEntity<String> addStudentDetails(@RequestBody StudentDetails studentDetails) {
        userService.addStudentData(studentDetails);
        return ResponseEntity.ok("Data added");

    }

    //http methods
    @GetMapping(value = "/getStudentDetails")
    public ResponseEntity<List<String>> getStudentDetails() {
        return ResponseEntity.ok(userService.getStudentData());

    }
}
