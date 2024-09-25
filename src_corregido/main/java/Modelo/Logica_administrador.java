
package Modelo;

import java.util.ArrayList;

public class Logica_administrador {

    private static final Arreglo_Administradores admins = new Arreglo_Administradores();

    public static boolean autentificarAdmin(String nombre, String contraseña) {
        if (obtenerAdmin(nombre) != null) {
            return obtenerAdmin(nombre).getNombre().equals(nombre) &&
                    obtenerAdmin(nombre).getContraseña().equals(contraseña);
        } else {
            return false;
        }
    }

    public static boolean agregarAdmin(Administrador admin) {
        return admins.agregarAdmin(admin);
    }

    public static Administrador obtenerAdmin(String nombre) {
        return admins.obtenerAdmin(nombre);
    }

    public static ArrayList<Administrador> getAdministradores() {
        return Logica_administrador.admins.getAdministradores();
    }

    public static void setAdministradores(ArrayList<Administrador> administradores) {
        Logica_administrador.admins.setAdministradores(administradores);
    }

}
