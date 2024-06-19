package escolar.poe;

import javax.swing.*;

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

    public PaginaPrincipal(String userType) {
        this.userType = userType;
        if (this.userType.equals("docente")) {
            comenzarPruebaButton.setText("Ver Reportes");
            seleccionarMateriasBox.setVisible(false);
        } else if (this.userType.equals("alumno")) {
            registrarMateriaButton.setVisible(false);
        }
    }
    public JPanel getPrincipalGUI() {
        return PrincipalGUI;
    }
}
