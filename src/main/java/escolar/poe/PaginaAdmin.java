package escolar.poe;

import escolar.poe.Usuarios.Alumno;
import escolar.poe.Usuarios.Docente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PaginaAdmin {

    private Login login;
    private List<Alumno> alumnos = new ArrayList<>();
   private List<Docente> docentes = new ArrayList<>();
    private JFrame frame;
    private JButton salirButton;
    private JButton registrarButton;
    private JButton buscarButton;
    private JButton eliminarButton;
    private JRadioButton alumnoRadioButton;
    private JPanel AdminGUI;
    private JRadioButton maestroRadioButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public PaginaAdmin( JFrame frame) {

        login = new Login();

        this.frame = frame;
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setContentPane(login.getLogin());
                login.setAlumnos(alumnos);
                login.setDocentes(docentes);
                frame.setSize(600, 600);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getAdminGUI() {
        return AdminGUI;
    }
}
