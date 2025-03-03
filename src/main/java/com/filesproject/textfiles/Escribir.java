package com.filesproject.textfiles;

import java.io.FileWriter;
import java.io.IOException;

public class Escribir {
    public static void main(String[] args) {
        try (FileWriter escritor = new FileWriter("archivo.txt")) {
            escritor.write("Hola, esto es un ejemplo de escritura en archivos en Java.");
            System.out.println("Archivo escrito correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
}
