import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
  private JButton botonTitulo;
  private JLabel usuario;
  private JTextField textfield1;

  public Formulario(){
   setLayout(null);
   botonTitulo = new JButton("Cambiar");
    botonTitulo.setBounds(80,70,100,30);
    add(botonTitulo);
    botonTitulo.addActionListener(this);
  
   usuario = new JLabel("Usuario:");
    usuario.setBounds(30,30,80,30);
    add(usuario);
   
   textfield1 = new JTextField();
    textfield1.setBounds(80,30,170,30);
    add(textfield1);
 }
  public void actionPerformed(ActionEvent e){
   if(e.getSource() == botonTitulo){
    String titulo = textfield1.getText();
    setTitle(titulo); }
 }
  public static void main(String args[]){
   Formulario formulario1 = new Formulario();
   formulario1.setBounds(0,0,300,150);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);
   formulario1.setResizable(false);
 }
}