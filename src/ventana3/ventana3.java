package ventana3;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ventana3 extends JFrame {
    public ventana3() {
        this.setSize(500, 500);
        setTitle("Carnet de Estudiante");
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        this.getContentPane().add(panel);

        JLabel nombreLabel = new JLabel("Nombre:");
        JTextField nombreField = new JTextField(20);
        panel.add(nombreLabel);
        panel.add(nombreField);

        JLabel carreraLabel = new JLabel("Carrera:");
        JTextField carreraField = new JTextField(20);
        panel.add(carreraLabel);
        panel.add(carreraField);

        JLabel edadLabel = new JLabel("Edad:");
        JTextField edadField = new JTextField(5);
        panel.add(edadLabel);
        panel.add(edadField);

        JLabel etiqueta = new JLabel("UNIVERSIDAD UNIAGUSTINIANA");
        panel.add(etiqueta);
        etiqueta.setForeground(Color.BLACK);
        etiqueta.setFont(new java.awt.Font("Tahoma", 1, 24));

        JLabel etiqueta2 = new JLabel("Bienvenidos");
        panel.add(etiqueta2);
        etiqueta2.setForeground(Color.BLACK);

        // Ajustes visuales para el panel
        nombreLabel.setForeground(Color.BLACK);
        carreraLabel.setForeground(Color.BLACK);
        edadLabel.setForeground(Color.BLACK);
    }

    public static void main(String[] args) {
        // Crear una instancia de Ventana2 y mostrarla
        ventana3 ventana = new ventana3();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}


