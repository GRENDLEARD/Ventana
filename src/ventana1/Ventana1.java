
package ventana1;

 import java.awt.Color;
 import javax.swing.JFrame;
 import java.awt.Dimension;
 import javax. swing.JPanel;

 public class Ventana1 extends JFrame{
  public Ventana1(){
      this.setSize (500, 500);
      setTitle("Barra de Titulo");
      iniciarComponentes();

 }


     //this.getContentPane e(),setBackground (Color.BLUE):
 private void iniciarComponentes(){
   JPanel panel = new JPanel ();
  panel.setBackground (Color. BLACK);
this.getContentPane ().add (panel);
}
}