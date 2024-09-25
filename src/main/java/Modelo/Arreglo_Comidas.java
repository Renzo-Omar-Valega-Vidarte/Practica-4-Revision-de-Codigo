
package Modelo;

import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Arreglo_Comidas {

    private ArrayList<Comida> comidas;

    public Arreglo_Comidas() {
        this.comidas = new ArrayList<>();
        
        ImageIcon igplato1 = new ImageIcon("hamburguesa.png");
        ImageIcon igplato2 = new ImageIcon("papas.png");
        ImageIcon igplato3 = new ImageIcon("pollo.png");
        ImageIcon igplato4 = new ImageIcon("agua.png");
        ImageIcon igplato5 = new ImageIcon("coca_cola.png");
        ImageIcon igplato6 = new ImageIcon("fanta.png");
        ImageIcon igplato7 = new ImageIcon("ensalada.png");
        ImageIcon igplato8 = new ImageIcon("nachos.png");
        ImageIcon igplato9 = new ImageIcon("pan_al_ajo.png");
        
        Comida hamburguesa = new Comida("Hamburguesa", 14.90, igplato1, 10,
            "Hamburguesa tradicional con papas y carne");  

        Comida papas = new Comida("Papas fritas", 10.00, igplato2, 10, "Clásicas papas fritas con sal");

        Comida pollo = new Comida("Pollo frito", 17.30, igplato3, 10,
            "Pollo selecto frito en aceite de oliva");

        Comida agua = new Comida("Agua", 8.50, igplato4, 10, "agua traída del manantial de los andes");

        Comida coca_cola = new Comida("Coca cola", 9.00, igplato5, 10,
            "Coca cola clásica, evitar su consumo");

        Comida fanta = new Comida("Fanta", 7.00, igplato6, 10, "Fanta clásica, evitar su consumo");

        Comida ensalada = new Comida("Ensalada", 10.00, igplato7, 10, "Contiene lechuga, tomate, palta");

        Comida nachos = new Comida("Nachos", 13.30, igplato8, 10, "Nachos bañados en queso derretido");

        Comida pan_ajo = new Comida("Pan al ajo", 7.50, igplato9, 10, "Pan artesanal con ajos selectos");

        comidas.add(hamburguesa);
        comidas.add(papas);
        comidas.add(pollo);
        comidas.add(agua);
        comidas.add(coca_cola);
        comidas.add(fanta);
        comidas.add(ensalada);
        comidas.add(nachos);
        comidas.add(pan_ajo);
    }

    public int buscarComida(String nombre) {

        int posicion = -1;

        for (int i = 0; i < comidas.size(); i++) {
            if (comidas.get(i).getNombre().equals(nombre)) {
                posicion = i;
                break;
            }
        }

        return posicion;

    }

    public Comida obtenerComida(String nombre) {
        if (buscarComida(nombre) != -1) {
            return comidas.get(buscarComida(nombre));
        } else {
            return null;
        }
    }

    public Comida datosHamburguesa() {
        return comidas.get(0);
    }

    public Comida datosPapas() {
        return comidas.get(1);
    }

    public Comida datosPollo() {
        return comidas.get(2);
    }

    public Comida datosAgua() {
        return comidas.get(3);
    }

    public Comida datosCoca() {
        return comidas.get(4);
    }

    public Comida datosFanta() {
        return comidas.get(5);
    }

    public Comida datosEnsalada() {
        return comidas.get(6);
    }

    public Comida datosNachos() {
        return comidas.get(7);
    }

    public Comida datosPanAjo() {
        return comidas.get(8);
    }

    public ArrayList<Comida> getComidas() {
        return comidas;
    }

    public void setComidas(ArrayList<Comida> comidas) {
        this.comidas = comidas;
    }
    
    public ArrayList<Integer> getCantidades(){
        ArrayList<Integer> cantidades = new ArrayList<>();
        
        for(Comida comida: comidas){    
            cantidades.add(comida.getStock_producto());
        }
        
        return cantidades;
        
    }
    

}
