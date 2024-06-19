package escolar.poe;

import javax.swing.*;

public class PaginaPrincipal {
    private JPanel panel1;
    private JFrame frame;
    private JLabel logo;
    private JTextPane textoDePruebaTextPane;
    private JButton salirButton;
    private JButton verMisRespuestasButton;
    private JButton comenzarPruebaButton;
    private JPanel PrincipalGUI;
    private String userType;

    public PaginaPrincipal(JFrame frame, String userType) {
        this.frame = frame;
        this.userType = userType;
    }

    public JPanel getPrincipalGUI() {
        return PrincipalGUI;
    }
}
