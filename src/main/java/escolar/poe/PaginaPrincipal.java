package escolar.poe;

import escolar.poe.Usuarios.Alumno;
import escolar.poe.Usuarios.Docente;
import escolar.poe.services.Materia;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PaginaPrincipal {
    private JPanel panel1;
    private JLabel logo;
    private JFrame frame;
    private JTextPane textoDePruebaTextPane;
    private JButton salirButton;
    private JButton verMisRespuestasButton;
    private JButton comenzarPruebaButton;
    private JPanel PrincipalGUI;
    private JButton registrarMateriaButton;
    private JComboBox seleccionarMateriasBox;
    private String userType;
    List<Materia> materias;
    DefaultComboBoxModel<String> model;
    private List<Alumno> alumnos;
    private List<Docente> docentes;
    private Login login;

    public PaginaPrincipal(String userType, JFrame frame, List<Alumno> alumnos, List<Docente> docentes, List<Materia> materias) {
        login = new Login();
        this.materias = materias;
        this.userType = userType;
        this.frame=frame;
        this.alumnos = alumnos;
        this.docentes = docentes;
        seleccionarMateriasBox.addItem("");
        if (!this.materias.isEmpty()) {
            for (Materia materia : this.materias) {
                seleccionarMateriasBox.addItem(materia.getNombre());
            }
        }

        if (this.userType.equals("docente")) {
            comenzarPruebaButton.setText("Ver Reportes");
            seleccionarMateriasBox.setVisible(false);
        } else if (this.userType.equals("alumno")) {
            registrarMateriaButton.setVisible(false);
        }
        comenzarPruebaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        verMisRespuestasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        registrarMateriaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String materia = JOptionPane.showInputDialog("Ingrese el nombre de la materia");
                if (materia.isEmpty()) {
                    return;
                }
                PaginaPrincipal.this.materias.add(new Materia(materia));
                JOptionPane.showMessageDialog(null, "Materia agregada");
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setContentPane(login.getLogin());
                login.setAlumnos(alumnos);
                login.setDocentes(docentes);
                login.setMaterias(PaginaPrincipal.this.materias);
                frame.setSize(300, 400);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public JPanel getPrincipalGUI() {
        return PrincipalGUI;
    }
}
