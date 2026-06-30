package com.krakedev.veterinaria.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 @Data es una libreria de lombok
 que genera automaticamente los metodos getter y setter
 sin necesidad de escribirlos manualmente.
*/

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Messaje {
    private int id;
    private String content;
}
