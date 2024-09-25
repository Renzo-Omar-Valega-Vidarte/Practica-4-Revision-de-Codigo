
package controlador;

import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
import java.util.logging.Level;





public class CtrlAdminRegistro implements ActionListener {

    private static final Logger logger = Logger.getLogger(CtrlAdminRegistro.class.getName());

    private final LogicaAdministrador logAdmin;
    private final LogicaUsuario logUser;
    private final LogicaComida logicaComida;
    private final LogicaPedido logPedido;
    private final LogicaHistorial logHistorial;

    private final AdmRegistro pagAdmRegistro;


    public Ctrl_Admin_registro(LogicaAdministrador logAdmin, LogicaUsuario logUser, LogicaComida logicaComida,
    LogicaPedido logPedido, LogicaHistorial logHistorial, AdmRegistro pagAdmRegistro) {
        this.logAdmin = logAdmin;
        this.logUser = logUser;
        this.logicaComida = logicaComida;
        this.logPedido = logPedido;
        this.logHistorial = logHistorial;
        this.pagAdmRegistro = pagAdmRegistro;
        this.pagAdmRegistro.btnIngresar.addActionListener(this);
        this.pagAdmRegistro.btnAtras.addActionListener(this);
        this.pagAdmRegistro.btnInicio.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == pagAdm_registro.btnAtras || source == pagAdm_registro.btnInicio) {
            handleNavigation();
        } else if (source == pagAdm_registro.btnIngresar) {
            handleAdminRegistration();
        }
    }

    private void handleNavigation() {
        Adm_ingresar pagAdmIngresar = new Adm_ingresar();
        Ctrl_Adm_ingresar ctrlAdmIngresar = new Ctrl_Adm_ingresar(logAdmin, logUser, logicaComida, logPedido, logHistorial, pagAdmIngresar);
        ctrlAdmIngresar.iniciar();
        this.pagAdm_registro.dispose();
    }

    private void handleAdminRegistration() {
        if (areFieldsValid()) {
            String aniosValidar = pagAdm_registro.txtServicio.getText();

            if (aniosValidar.matches("^\\d+$")) {
                Administrador admin = createAdminFromForm();
                processAdmin(admin);
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar valores válidos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Rellenar todos los datos");
        }
    }

    private boolean areFieldsValid() {
        return !pagAdm_registro.txtCargo.getText().isEmpty() &&
            !pagAdm_registro.txtContraseña.getText().isEmpty() &&
            !pagAdm_registro.txtServicio.getText().isEmpty() &&
            !pagAdm_registro.txtNombre1.getText().isEmpty();
    }

    private Administrador createAdminFromForm() {
        return new Administrador(pagAdm_registro.txtCargo.getText(),
                                pagAdm_registro.txtServicio.getText(),
                                pagAdm_registro.txtNombre1.getText(),
                                pagAdm_registro.txtContraseña.getText());
    }

    private void processAdmin(Administrador admin) {
        if (Logica_administrador.agregarAdmin(admin)) {
            handleNavigation();
            saveAdminsToFile();
        } else {
            JOptionPane.showMessageDialog(null, "Administrador ya existente");
        }
    }

    private void saveAdminsToFile() {
        try (ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("adm.txt"))) {
            ArrayList<Administrador> admAux = Logica_administrador.getAdministradores();
            escribiendoFichero.writeObject(admAux);
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "Error en agregar administrador", ex);
        }
    }


    public void iniciar() {
        this.pagAdm_registro.setLocationRelativeTo(null);
        this.pagAdm_registro.setVisible(true);
    }

}
