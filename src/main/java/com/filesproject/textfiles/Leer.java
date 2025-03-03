package com.filesproject.textfiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leer {
    public static void main(String[] args) {
         try (BufferedReader lector = new BufferedReader(new FileReader("archivo.txt"))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }       
    }
}
