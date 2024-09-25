
package Modelo;

import java.util.ArrayList;

public class Logica_usuario {

    private static final Arreglo_Usuarios usuarios = new Arreglo_Usuarios();

    public static boolean autentificarUsuario(String nombre, String contraseña) {
        if (obtenerUsuario(nombre) != null) {
            return obtenerUsuario(nombre).getNombre().equals(nombre) &&
                    obtenerUsuario(nombre).getContraseña().equals(contraseña);
        } else {
            return false;
        }
    }

    public static boolean agregarUsuario(Usuario usuario) {
        return usuarios.agregarUsuario(usuario);
    }

    public static Usuario obtenerUsuario(String nombre) {
        return usuarios.obtenerUsuario(nombre);
    }

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios.getUsuarios();
    }

    public static void setUsuarios(ArrayList<Usuario> usuarios) {
        Logica_usuario.usuarios.setUsuarios(usuarios);
    }

}
