package com.krakedev.veterinaria.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.veterinaria.entity.Mascota;
import org.springframework.web.bind.annotation.PostMapping;



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

    //Obtener Macota por id
    // /mascota/2
    @GetMapping("/{id}")
    public Mascota obtenerMascotaPorId(@PathVariable("id") int id){
        Optional<Mascota> mascota = mascotas.stream()
        .filter(m -> m.getId() == id)
        .findFirst();
        
        return mascota.orElse(null);
    }

    @PostMapping
    public Mascota crearMascota(@RequestBody Mascota nuevaMascota){
        mascotas.add(nuevaMascota);
        return nuevaMascota;
    }

    @DeleteMapping("/{id}")    
    public void eliminarMascota(@PathVariable("id") int id){
        mascotas.removeIf(m -> m.getId() == id);
    }

}
