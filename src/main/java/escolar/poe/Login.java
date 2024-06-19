package escolar.poe;

import escolar.poe.Usuarios.Admin;
import escolar.poe.Usuarios.Alumno;
import escolar.poe.Usuarios.Docente;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Login {
    private static JFrame frame;

    private JTextField usuarioTextField;
    private JTextField contraseñaTextField;
    private JButton iniciarSesiónButton;
    private JPanel login;
    private JPanel panel1;
    private List<Admin> administrativos;
    private List<Alumno> alumnos;
    private List<Docente> docentes;
    String typeUser;


    public Login() {
        frame = new JFrame();
        administrativos = new ArrayList<>();
        alumnos = new ArrayList<>();
        docentes = new ArrayList<>();
        administrativos.add(new Admin("admin", 1234));

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
                if (usuarioTextField.getText().isEmpty() || usuarioTextField.getText().equals("Nombre")) {
                    JOptionPane.showMessageDialog(null, "Nombre no ingresado");
                    usuarioTextField.requestFocus();
                    return;
                }
                if (contraseñaTextField.getText().isEmpty() || contraseñaTextField.getText().equals("Registro")) {
                    JOptionPane.showMessageDialog(null, "Registro no ingresado");
                    contraseñaTextField.requestFocus();
                    return;
                }
                String usuario = usuarioTextField.getText();
                int password = Integer.parseInt(contraseñaTextField.getText());
                for (Admin admin : administrativos) {
                    if (usuario.equals(admin.getUsuario())) {
                        if (password == admin.getContraseña()) {
                            frame.setContentPane(new PaginaAdmin().getAdminGUI());
                            frame.setSize(600, 600);
                            frame.setLocationRelativeTo(null);
                            frame.setVisible(true);
                        }
                    }
                }
                for (Alumno alumno : alumnos) {
                    if (usuario.equals(alumno.getNombre())) {
                        if (password == alumno.getRegistro()) {
                            frame.setContentPane(new PaginaPrincipal(frame, "alumno").getPrincipalGUI());
                            frame.setSize(600, 600);
                            frame.setLocationRelativeTo(null);
                            frame.setVisible(true);
                        }
                    }
                }
                for (Docente docente : docentes) {
                    if (usuario.equals(docente.getNombre())) {
                        if (password == docente.getRegistro()) {
                            frame.setContentPane(new PaginaPrincipal(frame, "docente").getPrincipalGUI());
                            frame.setSize(600, 600);
                            frame.setLocationRelativeTo(null);
                            frame.setVisible(true);
                        }
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
        frame.setContentPane(new Login().login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 400);
        frame.setVisible(true);
    }

    public JPanel getLogin() {
        return login;
    }
}
