
package Modelo;

import java.io.Serializable;
import java.util.Random;

public abstract class Persona implements Serializable {
    private String nombre;
    private String contraseña;
    private final String ID = generarID();

    public Persona(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getID() {
        return ID;
    }

    public String generarID() {

        Random aleatorio = new Random();
        String cad1;
        char cad2;
        int num;

        cad2 = (char) (Math.random() * 26 + 65); // 65 porque representa a la "A" en código ASCII, haciendo una cast a
                                                 // char lo volvemos una letra

        num = (aleatorio.nextInt(999 - 100 + 1) + 100);

        cad1 = Integer.toString(num);

        cad1 = cad2 + "-" + cad1;

        return cad1;
    }
}
