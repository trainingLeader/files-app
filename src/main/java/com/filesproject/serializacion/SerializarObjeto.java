package com.filesproject.serializacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializarObjeto {
    public static void main(String[] args) {
        try {
            // Crear un objeto de tipo Persona
            Persona persona = new Persona("Juan Perez", 25);
            // Crear un objeto de tipo ObjectOutputStream
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("persona.dat"));
            // Escribir el objeto en el archivo
            escritor.writeObject(persona);
            // Cerrar el flujo de datos
            escritor.close();
            System.out.println("Objeto serializado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
