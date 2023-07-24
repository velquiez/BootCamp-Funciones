import javax.swing.*;

public class Interfaz2 extends JFrame{
 private JLabel label1;

  public Interfaz2(){
  setLayout (null);
  label1 = new JLabel("Repaso de creacion interfaz");
  label1.setBounds(10,15, 250,300);
  add(label1); 
  }
  public static void main(String args[]){
  Interfaz2 formulario = new Interfaz2();
  formulario.setBounds(0,0,300,400);
  formulario.setVisible(true);
  formulario.setLocationRelativeTo(null);
  }
}