
package Modelo;

public class Logica_pedido {

    private static final Arreglo_Pedidos pedidos = new Arreglo_Pedidos();

    public static Pedido devolverPedido(int i) {
        return pedidos.devolverPedido(i);
    }

    public static void agregarPedido(Pedido pedido) {
        pedidos.agregarPedido(pedido);
    }

    public static String obtenerSubTotal() {
        return pedidos.obtenerSubTotal();
    }

    public static String obtenerDescuento() {
        return pedidos.obtenerDescuento();
    }

    public static String obtenerTotal() {
        return pedidos.obtenerTotal();
    }

    public static int getSize() {
        return pedidos.getSize();
    }

    public static void Limpiar() {
        pedidos.Limpiar();
    }

}
