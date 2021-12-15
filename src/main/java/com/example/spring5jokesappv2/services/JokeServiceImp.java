package com.example.spring5jokesappv2.services;
//package guru.springframework.norris.chuck;


import org.springframework.stereotype.Service;

@Service
public class JokeServiceImp implements JokeService {

    @Override
    public String mostrarBroma() {


        return "Bromita";
    }

}
