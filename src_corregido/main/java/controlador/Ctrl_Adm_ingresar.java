
package Controlador;

import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Ctrl_Adm_ingresar implements ActionListener {

    private final Logica_administrador log_admin;
    private final Logica_usuario log_usser;
    private final Logica_comida logica_comida;
    private final Logica_pedido log_pedido;
    private final Logica_historial log_historial;

    private final Adm_ingresar pagAdm_ingresar;

    public Ctrl_Adm_ingresar(Logica_administrador log_admin, Logica_usuario log_usser, Logica_comida logica_comida,
            Logica_pedido log_pedido, Logica_historial log_historial, Adm_ingresar pagAdm_ingresar) {
        this.log_admin = log_admin;
        this.log_usser = log_usser;
        this.logica_comida = logica_comida;
        this.log_pedido = log_pedido;
        this.log_historial = log_historial;
        this.pagAdm_ingresar = pagAdm_ingresar;
        this.pagAdm_ingresar.btnAcceder.addActionListener(this);
        this.pagAdm_ingresar.btnRegistrar.addActionListener(this);
        this.pagAdm_ingresar.chkMostrar.addActionListener(this);
        this.pagAdm_ingresar.btnAtras.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == pagAdm_ingresar.btnAtras) {
            principal pag_principal = new principal();
            Ctrl_principal ctrl_principal = new Ctrl_principal(log_admin, log_usser, logica_comida, log_pedido,
                    log_historial, pag_principal);
            ctrl_principal.iniciar();
            this.pagAdm_ingresar.dispose();
        }

        if (e.getSource() == pagAdm_ingresar.btnAcceder) {

            char[] contrasenia = pagAdm_ingresar.txtContraseña.getPassword();
            
            String contrasenia_aux = new String(contrasenia);

            if (!pagAdm_ingresar.txtNombre1.getText().isEmpty()
                    && !contrasenia_aux.isEmpty()) {
                if (Logica_administrador.autentificarAdmin(pagAdm_ingresar.txtNombre1.getText(),
                        contrasenia_aux)) {
                    StockDisponible pag_StockDisponible = new StockDisponible();
                    Ctrl_StockDisponible ctrl_StockDisponible = new Ctrl_StockDisponible(log_admin, log_usser,
                            logica_comida, log_pedido, log_historial, pag_StockDisponible);
                    ctrl_StockDisponible.iniciar();
                    this.pagAdm_ingresar.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorectos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Falta ingresar usuario o contraseña");
            }

        }

        if (e.getSource() == pagAdm_ingresar.chkMostrar) {
            if (pagAdm_ingresar.chkMostrar.isSelected()) {
                pagAdm_ingresar.txtContraseña.setEchoChar((char) 0);
            } else {
                pagAdm_ingresar.txtContraseña.setEchoChar('*');
            }
        }

        if (e.getSource() == pagAdm_ingresar.btnRegistrar) {
            Adm_registro paAdm_registro = new Adm_registro();
            Ctrl_Admin_registro ctrl_Admin_registro = new Ctrl_Admin_registro(log_admin, log_usser, logica_comida,
                    log_pedido, log_historial, paAdm_registro);
            ctrl_Admin_registro.iniciar();
            this.pagAdm_ingresar.dispose();
        }
    }

    public void iniciar() {
        this.pagAdm_ingresar.setLocationRelativeTo(null);
        this.pagAdm_ingresar.setVisible(true);
    }

}
