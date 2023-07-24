import javax.swing.*;
import java.awt.event.*;

public class Combi extends JFrame implements ActionListener{

  private JTextField textfield;
  private JButton agregar, cerrar;
  private JTextArea textarea;
  private JScrollPane scrollpane1;
  String texto = "";

 public Combi(){
  
  setLayout(null);
  textfield = new JTextField();
  textfield.setBounds(10,10,150,30);
  add(textfield);

  textarea = new JTextArea();
  scrollpane1 = new JScrollPane(textarea);  
  scrollpane1.setBounds(10,45,300,250);
  add(scrollpane1);

  agregar = new JButton("Agregar");
  agregar.setBounds(150,10,100,30);
  agregar.addActionListener(this);
  add(agregar);
  

  cerrar = new JButton("Cerrar");
  cerrar.setBounds(265,10,100,30);
  cerrar.addActionListener(this); 
  add(cerrar);
 }

 public void actionPerformed(ActionEvent e){
 if(e.getSource() == agregar){
   texto += textfield.getText() + "\n";
   textarea.setText(texto);
   textfield.setText("");}

  if(e.getSource() == cerrar){
   System.exit(0);}
   }
 
 public static void main(String args[]){
  Combi formulario = new Combi();
  formulario.setBounds(0,0,400,330);
  formulario.setVisible(true);
  formulario.setResizable(false);
  formulario.setLocationRelativeTo(null);
 }
}