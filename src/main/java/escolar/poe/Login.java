package escolar.poe;

import escolar.poe.Usuarios.Admin;
import escolar.poe.Usuarios.Alumno;
import escolar.poe.Usuarios.Docente;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Login {
    private JPanel loginGUI;
    private JTextField usuarioTextField;
    private JTextField contraseñaTextField;
    private JButton iniciarSesiónButton;
    private JPanel panel1;

    private List<Admin> administrativos;
    private List<Alumno> alumnos;
    private List<Docente> docentes;
    String typeUser;


    public Login() {

        administrativos = new ArrayList<>();
        alumnos = new ArrayList<>();
        docentes = new ArrayList<>();
        administrativos.add(new Admin("admin", "admin01"));

        usuarioTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((Character.isAlphabetic(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });
        contraseñaTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((Character.isLetterOrDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) || (c == KeyEvent.VK_ENTER)) {
                    e.consume();
                }
                if (c == KeyEvent.VK_ENTER) {
                    iniciarSesiónButton.doClick();
                }
            }
        });
        iniciarSesiónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (usuarioTextField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Usuario no ingresado");
                    return;
                }
                if (contraseñaTextField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Usuario no ingresado");
                    return;
                }
                String usuario = usuarioTextField.getText();
                String password = contraseñaTextField.getText();
                for (Admin admin : administrativos){
                    if (usuario.equals(admin.getUsuario())){

                    }
                }
            }
        });
        contraseñaTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                contraseñaTextField.setText("");
            }
        });
        usuarioTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                usuarioTextField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login().loginGUI);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public JPanel getLoginGUI() {
        return loginGUI;
    }
}
