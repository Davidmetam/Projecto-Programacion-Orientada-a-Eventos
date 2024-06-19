package escolar.poe;

import escolar.poe.services.Materia;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PaginaPrincipal {
    private JPanel panel1;
    private JLabel logo;
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

    public PaginaPrincipal(String userType) {
        materias = new ArrayList<>();
        this.userType = userType;
        seleccionarMateriasBox.addItem("");
        if (!materias.isEmpty()) {
            for (Materia materia : materias) {
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
                materias.add(new Materia(materia));
                JOptionPane.showMessageDialog(null, "Materia agregada");
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
