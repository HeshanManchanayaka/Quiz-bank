package edu.icet.controller;


import edu.icet.dto.Exam;
import edu.icet.service.ExamService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exam")

public class ExamController {

    @Autowired
    ExamService service;

    @PostMapping("/create-exam")
    public void createExam(@RequestBody Exam exam){

    }
}
