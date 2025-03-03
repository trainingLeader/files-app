package com.filesproject.serializacion;

import java.io.Serializable;

class Persona implements Serializable {
    private static final long serialVersionUID = 1L;  // Evita problemas en la deserialización
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
