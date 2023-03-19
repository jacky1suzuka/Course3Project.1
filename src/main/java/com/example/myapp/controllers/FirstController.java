package com.example.myapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String hello() {
        return "hello!";
    }

    @GetMapping("/info")
    public String info() {
        return "Имя ученика : Евгений" + "<br>" +
                "Название проекта: MyApp" + "<br>" +
                "Дата создания: 17.03.2023" + "<br>" +
                "Описание проекта: веб-сервис для выбора рецептов";
    }
}
