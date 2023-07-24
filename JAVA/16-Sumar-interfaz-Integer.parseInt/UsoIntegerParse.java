import javax.swing.*;
import java.awt.event.*;

public class UsoIntegerParse extends JFrame implements ActionListener{
 
 private JLabel labelvalor1, labelvalor2, labelresultado;
 private JButton botonsumar, cerrar;
 private JTextField fieldvalor1, fieldvalor2;

 public UsoIntegerParse(){
  setLayout(null);
  labelvalor1 = new JLabel("Valor 1:");
  labelvalor1.setBounds(50,5,100,30);
  add(labelvalor1);

  labelvalor2 = new JLabel("Valor 2:");
  labelvalor2.setBounds(50, 35, 100,30);
  add(labelvalor2);

  labelresultado = new JLabel("Resultado:");
  labelresultado.setBounds(120,80,100,30);
  add(labelresultado);
   
  fieldvalor1 = new JTextField();
  fieldvalor1.setBounds(120,10,150,20);
  add(fieldvalor1);

  fieldvalor2 = new JTextField();
  fieldvalor2.setBounds(120,40,150,20);
  add(fieldvalor2);

  botonsumar = new JButton("Sumar");
  botonsumar.setBounds(10,140,100,30);
  add(botonsumar);
  botonsumar.addActionListener(this);

  cerrar = new JButton("Cerrar");
  cerrar.setBounds(129,140,90,30);
  add(cerrar);
  cerrar.addActionListener(this);
 }
  public void actionPerformed(ActionEvent e){
   if(e.getSource() == botonsumar){
    int valor1 = 0, valor2 = 0, resultado = 0;
    
    valor1 = Integer.parseInt(fieldvalor1.getText());
    valor2 = Integer.parseInt(fieldvalor2.getText());
   
   resultado = valor1 + valor2;
  
    labelresultado.setText("Resultado: " + resultado);
    }
   if(e.getSource() == cerrar){
    System.exit(0);
    }
  }
 public static void main(String args[]){
  UsoIntegerParse formulario = new UsoIntegerParse();
  formulario.setBounds(0,0,300,220);
  formulario.setVisible(true);
  formulario.setResizable(false);
  formulario.setLocationRelativeTo(null);
 }
}