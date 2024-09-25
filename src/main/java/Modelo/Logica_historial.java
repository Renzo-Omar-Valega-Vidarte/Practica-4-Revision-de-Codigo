
package Modelo;

import java.util.ArrayList;

public class Logica_historial {

    private static final Arreglo_Historiales historiales = new Arreglo_Historiales();

    public static Historial devolverHistorial(int i) {
        return historiales.devolverHistorial(i);
    }

    public static void agregarHistorial(Historial historial) {
        historiales.agregarHistorial(historial);
    }

    public static String obtenerTotal_General() {
        return historiales.obtenerTotal_General();
    }

    public static int getSize() {
        return historiales.getSize();
    }

    public static ArrayList<Historial> getHistoriales() {
        return Logica_historial.historiales.getHistoriales();
    }

    public static void setHistoriales(ArrayList<Historial> historiales) {
        Logica_historial.historiales.setHistoriales(historiales);
    }

}
