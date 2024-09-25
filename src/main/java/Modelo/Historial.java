
package Modelo;

import java.io.Serializable;

public class Historial implements Serializable {

    private String ID_cliente;
    private String nombre_usuario;
    private double total_pagar;

    public Historial(String ID_cliente, String nombre_usuario, double total_pagar) {
        this.ID_cliente = ID_cliente;
        this.nombre_usuario = nombre_usuario;
        this.total_pagar = total_pagar;
    }

    public String getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(String ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public double getTotal_pagar() {
        return total_pagar;
    }

    public void setTotal_pagar(double total_pagar) {
        this.total_pagar = total_pagar;
    }

}
