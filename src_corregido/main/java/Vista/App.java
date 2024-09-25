
package Vista;

import Controlador.*;
import java.io.*;
import Modelo.*;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Logica_administrador logica_administrador = new Logica_administrador();
        Logica_usuario logica_usuario = new Logica_usuario();
        Logica_comida logica_comida = new Logica_comida();
        Logica_pedido logica_pedido = new Logica_pedido();
        Logica_historial logica_historial = new Logica_historial();

        try {

            ObjectInputStream recuperando_usser;

            FileInputStream usser = new FileInputStream("usser.txt");

            recuperando_usser = new ObjectInputStream(usser);

            ArrayList<Usuario> usuarios_recuperados = new ArrayList<>();

            usuarios_recuperados = (ArrayList<Usuario>) recuperando_usser.readObject();

            recuperando_usser.close();

            Logica_usuario.setUsuarios(usuarios_recuperados);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error en recuperar los datos del usuario");
        }

        try {
            ObjectInputStream recuperando_adm;

            FileInputStream adm = new FileInputStream("adm.txt");

            recuperando_adm = new ObjectInputStream(adm);

            ArrayList<Administrador> adm_recuperados = new ArrayList<>();

            adm_recuperados = (ArrayList<Administrador>) recuperando_adm.readObject();

            recuperando_adm.close();

            Logica_administrador.setAdministradores(adm_recuperados);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error en recuperar los datos del administrador");
        }

        try {
            ObjectInputStream recuperando_comida;

            FileInputStream comida = new FileInputStream("comida.txt");

            recuperando_comida = new ObjectInputStream(comida);

            ArrayList<Comida> comida_recuperados = new ArrayList<>();

            comida_recuperados = (ArrayList<Comida>) recuperando_comida.readObject();

            recuperando_comida.close();

            Logica_comida.setComidas(comida_recuperados);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error en recuperar los datos de la comida");
        }

        try {
            ObjectInputStream recuperando_historial;

            FileInputStream historial = new FileInputStream("historial.txt");

            recuperando_historial = new ObjectInputStream(historial);

            ArrayList<Historial> historial_recuperados = new ArrayList<>();

            historial_recuperados = (ArrayList<Historial>) recuperando_historial.readObject();

            recuperando_historial.close();

            Logica_historial.setHistoriales(historial_recuperados);
            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error en recuperar los datos del historial");
        }

        principal pag_principal = new principal();
        Ctrl_principal ctrl_principal = new Ctrl_principal(logica_administrador, logica_usuario, logica_comida,
                logica_pedido, logica_historial, pag_principal);

        ctrl_principal.iniciar();

    }
}
