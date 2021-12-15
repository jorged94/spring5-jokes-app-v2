package com.example.spring5jokesappv2.controllers;

import com.example.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;

@Controller
public class JokeController {

    final private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    public String bromear(){
        return jokeService.mostrarBroma();
    }
}
