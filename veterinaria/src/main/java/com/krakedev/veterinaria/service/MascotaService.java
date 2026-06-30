package com.krakedev.veterinaria.service;

import java.util.List;
import java.util.Optional;

import com.krakedev.veterinaria.entity.Mascota;

public interface MascotaService {

    Mascota registrarMascota(Mascota mascota);

    List<Mascota> listarMascota();

    Optional<Mascota> buscarPorNombre(String nombre);

    Optional<Mascota> buscarPorId(Long id);

    Mascota actualizarMascota(Long id, Mascota mascota);
    Mascota cambiarEstado(Long id, com.krakedev.veterinaria.entity.EstadoMascota estado);
    List<Mascota> listarPorEstado(com.krakedev.veterinaria.entity.EstadoMascota estado);

    void eliminarMascota(Long id);

}
