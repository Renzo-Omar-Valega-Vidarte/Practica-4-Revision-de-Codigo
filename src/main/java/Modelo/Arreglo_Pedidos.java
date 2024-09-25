
package Modelo;

import java.util.ArrayList;

public class Arreglo_Pedidos {

    private final ArrayList<Pedido> pedidos;

    public Arreglo_Pedidos() {
        this.pedidos = new ArrayList<>();
    }

    public Pedido devolverPedido(int i) {
        return pedidos.get(i);
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);

    }

    public String obtenerSubTotal() {

        double subtotal = 0;

        for (int i = 0; i < pedidos.size(); i++) {
            subtotal = subtotal + pedidos.get(i).getPrecio_total();
        }

        subtotal = (double) Math.round(subtotal * 100d) / 100; /// Evitar valores basura

        return Double.toString(subtotal);
    }

    public String obtenerDescuento() {

        double subtotal = Double.parseDouble(obtenerSubTotal());

        double descuento = 0;

        if (subtotal > 50) {
            descuento = subtotal * 0.1;
        }

        descuento = (double) Math.round(descuento * 100d) / 100; /// Evitar valores basura

        return Double.toString(descuento);
    }

    public String obtenerTotal() {

        double subtotal = Double.parseDouble(obtenerSubTotal());
        double descuento = Double.parseDouble(obtenerDescuento());

        double total = subtotal - descuento;

        total = (double) Math.round(total * 100d) / 100; /// Evitar valores basura

        return Double.toString(total);
    }

    public int getSize() {
        return pedidos.size();
    }

    public void Limpiar() {
        pedidos.clear();
    }

}
