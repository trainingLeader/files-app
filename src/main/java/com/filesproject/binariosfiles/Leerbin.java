package com.filesproject.binariosfiles;

import java.io.FileInputStream;
import java.io.IOException;

public class Leerbin {
    public static void main(String[] args) {
            try (FileInputStream lector = new FileInputStream("archivo.bin")) {
                int byteLeido;
                while ((byteLeido = lector.read()) != -1) {
                    System.out.print((char) byteLeido);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
