
package Modelo;

import java.util.ArrayList;

public class Logica_comida {

    private static final Arreglo_Comidas comidas = new Arreglo_Comidas();

    public static Comida obtenerComida(String nombre) {
        return comidas.obtenerComida(nombre);
    }

    public static Comida datosHamburguesa() {
        return comidas.datosHamburguesa();
    }

    public static Comida datosPapas() {
        return comidas.datosPapas();
    }

    public static Comida datosPollo() {
        return comidas.datosPollo();
    }

    public static Comida datosAgua() {
        return comidas.datosAgua();
    }

    public static Comida datosCoca() {
        return comidas.datosCoca();
    }

    public static Comida datosFanta() {
        return comidas.datosFanta();
    }

    public static Comida datosEnsalada() {
        return comidas.datosEnsalada();
    }

    public static Comida datosNachos() {
        return comidas.datosNachos();
    }

    public static Comida datosPanAjo() {
        return comidas.datosPanAjo();
    }

    public static ArrayList<Comida> getComidas() {
        return Logica_comida.comidas.getComidas();
    }

    public static void setComidas(ArrayList<Comida> comidas) {
        Logica_comida.comidas.setComidas(comidas);
    }

    public static ArrayList<Integer> getCantidades() {
        return Logica_comida.comidas.getCantidades();
    }
}
