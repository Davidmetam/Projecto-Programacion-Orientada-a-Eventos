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
    private String userType;

    public PaginaPrincipal(String userType) {
        this.userType = userType;
    }

    public JPanel getPrincipalGUI() {
        return PrincipalGUI;
    }
}
