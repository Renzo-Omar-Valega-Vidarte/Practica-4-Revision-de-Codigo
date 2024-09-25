
package Modelo;

import java.util.ArrayList;

public class Arreglo_Administradores {

    private ArrayList<Administrador> administradores;

    public Arreglo_Administradores() {
        administradores = new ArrayList<>();
    }

    public int buscarAdmin(String nombre) {
        int posicion = -1;

        for (int i = 0; i < administradores.size(); i++) {
            if (administradores.get(i).getNombre().equals(nombre)) {
                posicion = i;
                break;
            }
        }

        return posicion;
    }

    public boolean agregarAdmin(Administrador admin) {

        if (buscarAdmin(admin.getNombre()) == -1) {
            administradores.add(admin);
            return true;
        } else {
            return false;
        }
    }

    public Administrador obtenerAdmin(String nombre) {
        if (buscarAdmin(nombre) != -1) {
            return administradores.get(buscarAdmin(nombre));
        } else {
            return null;
        }
    }

    public ArrayList<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(ArrayList<Administrador> administradores) {
        this.administradores = administradores;
    }

}
