package com.krakedev.veterinaria.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.veterinaria.entity.Mascota;

@RestController
@RequestMapping("/api/mascotas")

public class MascotaController {

    private List<Mascota> mascotas = new ArrayList<>();

    public MascotaController() {
        mascotas.add(new Mascota(1, "Bobby", "Perro", 5, "Alejandro"));
        mascotas.add(new Mascota(2, "Whiskers", "Gato", 3, "Maria"));
        mascotas.add(new Mascota(3, "Buddy", "Perro", 7, "Juan"));
    }

    @GetMapping
    public List<Mascota> getAllMascotas() {
        return mascotas;
    }

}
