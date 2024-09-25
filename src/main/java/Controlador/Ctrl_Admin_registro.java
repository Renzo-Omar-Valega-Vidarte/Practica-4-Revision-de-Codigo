
package Controlador;

import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ctrl_Admin_registro implements ActionListener {

    private final Logica_administrador log_admin;
    private final Logica_usuario log_usser;
    private final Logica_comida logica_comida;
    private final Logica_pedido log_pedido;
    private final Logica_historial log_historial;

    private final Adm_registro pagAdm_registro;

    public Ctrl_Admin_registro(Logica_administrador log_admin, Logica_usuario log_usser, Logica_comida logica_comida,
            Logica_pedido log_pedido, Logica_historial log_historial, Adm_registro pagAdm_registro) {
        this.log_admin = log_admin;
        this.log_usser = log_usser;
        this.logica_comida = logica_comida;
        this.log_pedido = log_pedido;
        this.log_historial = log_historial;
        this.pagAdm_registro = pagAdm_registro;
        this.pagAdm_registro.btnIngresar.addActionListener(this);
        this.pagAdm_registro.btnAtras.addActionListener(this);
        this.pagAdm_registro.btnInicio.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == pagAdm_registro.btnAtras) {
            Adm_ingresar pagAdm_ingresar = new Adm_ingresar();
            Ctrl_Adm_ingresar ctrl_Adm_ingresar = new Ctrl_Adm_ingresar(log_admin, log_usser, logica_comida, log_pedido,
                    log_historial, pagAdm_ingresar);
            ctrl_Adm_ingresar.iniciar();
            this.pagAdm_registro.dispose();
        }

        if (e.getSource() == pagAdm_registro.btnInicio) {
            Adm_ingresar pagAdm_ingresar = new Adm_ingresar();
            Ctrl_Adm_ingresar ctrl_Adm_ingresar = new Ctrl_Adm_ingresar(log_admin, log_usser, logica_comida, log_pedido,
                    log_historial, pagAdm_ingresar);
            ctrl_Adm_ingresar.iniciar();
            this.pagAdm_registro.dispose();
        }

        if (e.getSource() == pagAdm_registro.btnIngresar) {

            if (!pagAdm_registro.txtCargo.getText().isEmpty() && !pagAdm_registro.txtContraseña.getText().isEmpty() &&
                    !pagAdm_registro.txtServicio.getText().isEmpty()
                    && !pagAdm_registro.txtNombre1.getText().isEmpty()) {

                String anios_validar = pagAdm_registro.txtServicio.getText();

                if (anios_validar.matches("^[0-9]+$")) {

                    Administrador admin = new Administrador(pagAdm_registro.txtCargo.getText(),
                            pagAdm_registro.txtServicio.getText(),
                            pagAdm_registro.txtNombre1.getText(),
                            pagAdm_registro.txtContraseña.getText());

                    if (Logica_administrador.agregarAdmin(admin)) {
                        Adm_ingresar pagAdm_ingresar = new Adm_ingresar();
                        Ctrl_Adm_ingresar ctrl_Adm_ingresar = new Ctrl_Adm_ingresar(log_admin, log_usser,
                                logica_comida, log_pedido, log_historial, pagAdm_ingresar);
                        ctrl_Adm_ingresar.iniciar();
                        this.pagAdm_registro.dispose();

                        try {
                            ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(
                                    new FileOutputStream("adm.txt"));

                            ArrayList<Administrador> adm_aux;

                            adm_aux = Logica_administrador.getAdministradores();

                            escribiendo_fichero.writeObject(adm_aux);

                            escribiendo_fichero.close();

                        } catch (IOException ex) {
                            System.out.println("Error en agregar administrador");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Administrador ya existente");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Debe ingresar valores validos");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Rellenar todos los datos");
            }

        }

    }

    public void iniciar() {
        this.pagAdm_registro.setLocationRelativeTo(null);
        this.pagAdm_registro.setVisible(true);
    }

}
