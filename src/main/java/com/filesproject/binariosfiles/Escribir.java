package com.filesproject.binariosfiles;

import java.io.FileOutputStream;
import java.io.IOException;

public class Escribir {
    public static void main(String[] args) {
        try (FileOutputStream escritor = new FileOutputStream("archivo.bin")) {
            escritor.write("Hola, esto es un ejemplo de escritura en archivos binarios en Java.".getBytes());
            System.out.println("Archivo escrito correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
