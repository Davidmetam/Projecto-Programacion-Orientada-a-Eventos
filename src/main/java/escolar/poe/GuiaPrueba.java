package escolar.poe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiaPrueba {
    private JFrame frame;
    private JPanel panel1;
    private JButton regresarButton;
    private JButton comenzarButton;
    private JPanel GuiaGUI;
    private JTextArea guiadelaprueba;
    private String guiaPrueba;

    public GuiaPrueba(JFrame frame) {
        this.frame=frame;
        guiaPrueba = "1. Mantén una mente abierta: La prueba VAK no es un examen rígido, sino una herramienta para identificar tus fortalezas y preferencias de aprendizaje. \n" +
                "2. No te preocupes demasiado por los resultados.  Concéntrate en la actividad: Durante cada sección (visual, auditiva y kinestésica), concéntrate completamente en la actividad y trata de involucrarte al máximo.\n" +
                "3. Sé honesto contigo mismo: Responde a las preguntas y realiza las actividades de la manera más natural posible, sin intentar adivinar lo que se espera de ti.\n" +
                "4. Relájate: Recuerda que la prueba VAK no es una prueba de inteligencia, sino una herramienta para identificar tus fortalezas y preferencias de aprendizaje. Relájate y disfruta del proceso.";

        guiadelaprueba.setText(guiaPrueba);
        comenzarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setContentPane(new PruebaVAK().getPruebaGUI());
                frame.setSize(500, 500);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }

}
