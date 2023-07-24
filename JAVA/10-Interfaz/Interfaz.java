import javax.swing.*;

public class Interfaz extends JFrame{
  private JLabel label1;

  public Interfaz (){
   setLayout(null);
   label1 = new JLabel("Hola....velquiez skivelez.");
   label1.setBounds(20,0,135,15);
   add(label1);
  }
  public static void main(String args[]){
   Interfaz formulario1 = new Interfaz();
   formulario1.setBounds(0,0,300,150);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);
  }
}