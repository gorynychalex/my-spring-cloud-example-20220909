package ru.eshift.microservicestatistic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.eshift.microservicestatistic.model.Statistic;

@RestController
@RequestMapping("/api/v1/statistic")
public class StatisticController {

    @GetMapping
    public Statistic getStatistic(){
        return new Statistic(1L,"НОВЫЙ ТЕСТ",5);
    }

}
