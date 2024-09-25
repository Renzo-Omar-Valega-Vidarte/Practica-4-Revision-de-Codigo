
package Modelo;

import java.util.ArrayList;

public class Arreglo_Historiales {

    private ArrayList<Historial> historiales;

    public Arreglo_Historiales() {
        this.historiales = new ArrayList<>();
    }

    public Historial devolverHistorial(int i) {
        return historiales.get(i);
    }

    public void agregarHistorial(Historial historial) {
        historiales.add(historial);
    }

    public String obtenerTotal_General() {

        double total_general = 0;

        for (int i = 0; i < historiales.size(); i++) {
            total_general = total_general + historiales.get(i).getTotal_pagar();
        }

        total_general = (double) Math.round(total_general * 100d) / 100; /// Evitar valores basura

        return Double.toString(total_general);

    }

    public int getSize() {
        return historiales.size();
    }

    public ArrayList<Historial> getHistoriales() {
        return historiales;
    }

    public void setHistoriales(ArrayList<Historial> historiales) {
        this.historiales = historiales;
    }

}
