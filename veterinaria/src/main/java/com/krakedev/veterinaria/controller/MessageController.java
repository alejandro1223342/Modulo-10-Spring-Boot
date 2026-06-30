package com.krakedev.veterinaria.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.veterinaria.entity.Messaje;

@RestController
@RequestMapping("/api/messages")

public class MessageController {
    private List<Messaje> mensajes = new ArrayList<>();

    public MessageController() {
        mensajes.add(new Messaje(1, "Hello world"));
        mensajes.add(new Messaje(2, "Hello world"));
    }

    @GetMapping
    public List<Messaje> getAllMessages() {
        return mensajes;
    }
}
