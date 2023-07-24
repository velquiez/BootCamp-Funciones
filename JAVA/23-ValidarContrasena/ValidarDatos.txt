import javax.swing.*;
import java.awt.event.*;

public class Validardatos extends JFrame implements ActionListener
{
  private JButton boton1, cerrar;
  private JLabel label1, labelusuario, labelcontra;
  private JTextField textfield1, textfield2;

 public Validardatos()
 {
     setLayout(null);
  boton1 = new JButton("Validar");
   boton1.setBounds(130,150,100,30);
   boton1.addActionListener(this);
   add(boton1);

  label1 = new JLabel("Resultados de validacion");
   label1.setBounds(30,10,230,30);
   add(label1);

  labelusuario = new JLabel("Usuario");
   labelusuario.setBounds(10,40,90,30);
   add(labelusuario);
  textfield1 = new JTextField();
   textfield1.setBounds(110,40,100,30);
   add(textfield1);

  labelcontra = new JLabel("Contraseña");
   labelcontra.setBounds(10,90,90,30);
   add(labelcontra);
  textfield2 = new JTextField();
   textfield2.setBounds(110,90,100,30);
   add(textfield2);

  cerrar = new JButton("Cerrar");
   cerrar.setBounds(20,150,100,30);
   cerrar.addActionListener(this);
   add(cerrar);
  }
  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource() == cerrar){
     System.exit(0);
      }

   if(e.getSource() == boton1)
   {
     String usuario = textfield1.getText();
     String contrasena = textfield2.getText();

     if(usuario.equalsIgnoreCase("velquiez") && contrasena.equals("1234"))
      {
       label1.setText("Datos correctos");
      }
     else{
         label1.setText("Usuario o contrasena incorrectos");
         }
    }
  }
  public static void main(String args[]) 
  {
  Validardatos formulario = new Validardatos();
  formulario.setBounds(0,0,400,300);
  formulario.setVisible(true);
  formulario.setResizable(false);
  formulario.setLocationRelativeTo(null);
  }
}