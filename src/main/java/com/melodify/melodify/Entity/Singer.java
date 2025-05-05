package com.melodify.melodify.Entity;

import lombok.Data; // generar getters, setters, etc
import lombok.NoArgsConstructor; // constructor sin argumentos
import lombok.AllArgsConstructor; // constructor con todos los atributos
import lombok.Builder; // para crear objetos

import jakarta.persistence.Entity; // para la entidad de bd
import jakarta.persistence.Id; // marcar id como identificador de entidad -> es para identificar de manera exclusiva
import jakarta.persistence.GeneratedValue; // iniciar el id automaticamente
import jakarta.persistence.GenerationType; // especificar como se genera el id

@Entity // guardar la clase (cada cantante) como una fila en la bd
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Singer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // la bd genera el id automaticamente
    // columnas de la tabla
    private Long id;
    private String name;
    private String genre;
    private String favoriteSong;
}
