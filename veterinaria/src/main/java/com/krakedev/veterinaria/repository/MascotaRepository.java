package com.krakedev.veterinaria.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.krakedev.veterinaria.entity.Mascota;
import com.krakedev.veterinaria.entity.EstadoMascota;

public interface MascotaRepository extends JpaRepository<Mascota, Long>{
    Optional<Mascota> findById(Long id);
    Optional<Mascota> findByNombre(String nombre);
    List<Mascota> findByEspecie(String especie);    
    List<Mascota> findByEstado(EstadoMascota estado);

}