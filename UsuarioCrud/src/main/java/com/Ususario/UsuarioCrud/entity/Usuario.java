package com.Ususario.UsuarioCrud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nombre;
        private String paterno;
        private String materno;

        private LocalDate fechaNacimiento;

        private String genero;
        private String curp;
        private String rfc;

        private String direccion;
        private String calle;
        private String numInt;
        private String numExt;
        private String colonia;
        private String cp;
        private String municipio;
        private String estado;
        private String pais;
    }
