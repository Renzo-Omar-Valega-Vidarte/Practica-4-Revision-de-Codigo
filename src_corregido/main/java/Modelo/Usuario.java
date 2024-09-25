
package Modelo;

public class Usuario extends Persona  {

    private String direccion;
    private String numero_tarjeta;

    public Usuario(String direccion, String numero_tarjeta, String nombre, String contraseña) {
        super(nombre, contraseña);
        this.direccion = direccion;
        this.numero_tarjeta = numero_tarjeta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(String numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

}
