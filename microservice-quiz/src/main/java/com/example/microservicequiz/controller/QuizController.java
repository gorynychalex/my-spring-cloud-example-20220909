package com.example.microservicequiz.controller;

import com.example.microservicequiz.model.Quiz;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/quiz")
public class QuizController {

    @GetMapping
    public Quiz getQuiz(){
        return new Quiz("НОВЫЙ ТЕСТ");
    }

}
