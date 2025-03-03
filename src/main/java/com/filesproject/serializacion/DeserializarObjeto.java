package com.filesproject.serializacion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializarObjeto {
    public static void main(String[] args) {
        try (FileInputStream fileIn = new FileInputStream("persona.dat");
             ObjectInputStream objIn = new ObjectInputStream(fileIn)) {
            Persona persona = (Persona) objIn.readObject();
            System.out.println("Objeto deserializado: " + persona);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}
