package ventana2;
 import java.awt.Color;
 import javax.swing.JFrame;
 import java.awt.Dimension;
 import javax.swing.JPanel;
 import javax.swing.JLabel;
 
public class Ventana2 extends JFrame {
 public Ventana2 () {
      this.setSize (500, 500);
      setTitle("Barra de Titulo");
       iniciarComponentes ();
}
      //this. getContentPane () , setBackground (Color.BLUE):
   
 private void iniciarComponentes () {
   JPanel panel = new JPanel();
  panel.setBackground (Color. BLACK);
 this.getContentPane ().add (panel);

 
  JLabel etiqueta =new JLabel("UNIVERSIDAD UNIAGUSTINIANA");
 panel.add (etiqueta);
 
 etiqueta.setForeground (Color.WHITE);
 etiqueta.setFont (new java.awt.Font ("Tahoma", 1, 24));
 
  JLabel etiqueta2 =new JLabel("Bienvenidos");
 panel.add (etiqueta2);




}
 }

