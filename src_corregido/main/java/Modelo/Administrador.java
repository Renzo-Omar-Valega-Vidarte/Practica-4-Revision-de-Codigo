
package Modelo;


public class Administrador extends Persona {

    private String cargo;
    private String años_servicio;

    public Administrador(String cargo, String años_servicio, String nombre, String contraseña) {
        super(nombre, contraseña);
        this.cargo = cargo;
        this.años_servicio = años_servicio;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAños_servicio() {
        return años_servicio;
    }

    public void setAños_servicio(String años_servicio) {
        this.años_servicio = años_servicio;
    }

}
