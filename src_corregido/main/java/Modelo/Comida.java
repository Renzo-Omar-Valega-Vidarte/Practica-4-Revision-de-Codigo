
package Modelo;

import java.io.Serializable;
import javax.swing.ImageIcon;

public class Comida implements Serializable {

    private String nombre;
    private double precio_unitario;
    private ImageIcon imagen;
    private int stock_producto;
    private String descripcion;

    public Comida(String nombre, double precio_unitario, ImageIcon imagen, int stock_producto, String descripcion) {
        this.nombre = nombre;
        this.precio_unitario = precio_unitario;
        this.imagen = imagen;
        this.stock_producto = stock_producto;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public int getStock_producto() {
        return stock_producto;
    }

    public void setStock_producto(int stock_producto) {
        this.stock_producto = stock_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
