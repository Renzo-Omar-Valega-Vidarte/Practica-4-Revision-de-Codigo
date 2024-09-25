
package Modelo;

import java.util.ArrayList;

public class Arreglo_Usuarios {

    private ArrayList<Usuario> usuarios;

    public Arreglo_Usuarios() {
        usuarios = new ArrayList<>();
    }

    public int buscarUsuario(String nombre) {
        int posicion = -1;

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getNombre().equals(nombre)) {
                posicion = i;
                break;
            }
        }

        return posicion;
    }

    public boolean agregarUsuario(Usuario usuario) {

        if (buscarUsuario(usuario.getNombre()) == -1) {
            usuarios.add(usuario);
            return true;
        } else {
            return false;
        }
    }

    public Usuario obtenerUsuario(String nombre) {
        if (buscarUsuario(nombre) != -1) {
            return usuarios.get(buscarUsuario(nombre));
        } else {
            return null;
        }
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}
