package com.example.microservicequiz.model;

import java.util.List;

public class Quiz {

    Integer id;

    String name;

//    List<Question> questionList;

    public Quiz() {
    }

    public Quiz(String name) {
        this.name = name;
    }

//    public Quiz(String name, List<Question> questionList) {
//        this.name = name;
//        this.questionList = questionList;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    public List<Question> getQuestionList() {
//        return questionList;
//    }
//
//    public void setQuestionList(List<Question> questionList) {
//        this.questionList = questionList;
//    }

}
