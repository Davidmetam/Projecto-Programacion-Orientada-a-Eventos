package escolar.poe;

import escolar.poe.Usuarios.Alumno;
import escolar.poe.Usuarios.Docente;

import javax.print.Doc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PaginaAdmin {

    private Login login;
    private List<Alumno> alumnos;
   private List<Docente> docentes;
    private JFrame frame;
    private JButton salirButton;
    private JButton registrarButton;
    private JButton buscarButton;
    private JButton eliminarButton;
    private JRadioButton alumnoRadioButton;
    private JPanel AdminGUI;
    private JRadioButton maestroRadioButton;
    private JTextField Registro;
    private JTextField Nombre;
    private JTextField Email;

    public PaginaAdmin(JFrame frame, List<Alumno> alumnos, List<Docente> docentes) {

        login = new Login();
        this.alumnos = alumnos;
        this.docentes = docentes;

        this.frame = frame;
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setContentPane(login.getLogin());
                login.setAlumnos(PaginaAdmin.this.alumnos);
                login.setDocentes(PaginaAdmin.this.docentes);
                frame.setSize(600, 600);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int registro = Integer.parseInt(Registro.getText());
                String nombre = Nombre.getText();
                String email = Email.getText();
               //validacion de campos
                if (Registro.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Datos invalidos");
                    return;
                }

                if (Nombre.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Datos invalidos");
                    return;
                }

                if (Email.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Datos invalidos");
                    return;
                }
                //Guardar datos
                if (alumnoRadioButton.isSelected()){

                    Alumno alumno = new Alumno(registro, nombre, email);
                    alumnos.add(alumno);

                    JOptionPane.showMessageDialog(null, "Resgistro de Alumno completo");

                } else if (maestroRadioButton.isSelected()) {

                    Docente docente = new Docente(registro, nombre, email);
                    docentes.add(docente);
                    JOptionPane.showMessageDialog(null, "Registro de Docente comppletado");

                } else {
                    JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna opción valida");
                }
                // Limpiar cajas de texto
                Registro.setText("");
                Nombre.setText("");
                Email.setText("");


            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int registroBusqueda = Integer.parseInt(Registro.getText());

                for(Alumno alumno : alumnos){
                    if(alumno.getRegistro() == registroBusqueda){

                        Registro.setText(String.valueOf(alumno.getRegistro()));
                        Nombre.setText(alumno.getNombre());
                        Email.setText(alumno.getEmail());
                        JOptionPane.showMessageDialog(null, "ALumno encontrado");
                        return;
                    }
                }
                for (Docente docente : docentes){
                    if (docente.getRegistro() == registroBusqueda){
                        Registro.setText(String.valueOf(docente.getRegistro()));
                        Nombre.setText(docente.getNombre());
                        Email.setText(docente.getEmail());
                        JOptionPane.showMessageDialog(null, "Docente encontrado");
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "No se encontraron Coindidencias");
            }
        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int registroEliminar = Integer.parseInt(Registro.getText());

                for(Alumno alumno : alumnos){
                    if(alumno.getRegistro() == registroEliminar){
                        alumnos.remove(alumno);
                        JOptionPane.showMessageDialog(null, "Alumno Eliminado");
                        return;
                    }
                }

                for(Docente docente : docentes){
                    if(docente.getRegistro() == registroEliminar){
                        docentes.remove(docente);
                        JOptionPane.showMessageDialog(null, "Docente Eliminado");
                        return;
                    }
                }

                JOptionPane.showMessageDialog(null, "No se encontraron Coincidencias");

            }
        });
    }

    public JPanel getAdminGUI() {
        return AdminGUI;
    }
}
