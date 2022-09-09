package ru.eshift.microservicestatistic.model;

import java.time.LocalDateTime;
import java.util.List;

public class Statistic {

    Long id;
    String quizName;
    int score;

    public Statistic(Long id, String quizName, int score) {
        this.id = id;
        this.quizName = quizName;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
