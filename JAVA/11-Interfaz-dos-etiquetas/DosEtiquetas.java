import javax.swing.*;

public class DosEtiquetas extends JFrame{
  private JLabel label1;
  private JLabel label2;

   public DosEtiquetas(){
   setLayout(null);
   label1 = new JLabel("Creando interfaz con dos mensajes");
   label1.setBounds(25,10,250,15);
   add(label1);
   label2 = new JLabel("Version 1.0");
   label2.setBounds(25,200,150,15);
   add(label2);
   }
   public static void main(String args[]){
   DosEtiquetas formulario = new DosEtiquetas();
   formulario.setBounds(0,0,300,350);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
   } 
}