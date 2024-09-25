
package Modelo;

public class Pedido {

    private String comida_pedido;
    private String cantidad;
    private double precio_total = 0;

    public Pedido(String comida_pedido, String cantidad, double precio_total) {
        this.comida_pedido = comida_pedido;
        this.cantidad = cantidad;
        this.precio_total = precio_total;
    }

    public String getComida_pedido() {
        return comida_pedido;
    }

    public void setComida_pedido(String comida_pedido) {
        this.comida_pedido = comida_pedido;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(Double precio_total) {
        this.precio_total = precio_total;
    }

}
