import javax.swing.*;
import java.awt.event.*;

public class UsoParse extends JFrame implements ActionListener{

 JLabel labelvalor1, labelvalor2, labelresultado;
 JButton botsumar, botcerrar;
 JTextField textfieldvalor1, textfieldvalor2;

  public UsoParse(){
  setLayout(null);
  
  labelvalor1 = new JLabel("Valor 1:");
  labelvalor1.setBounds(50,5,100,30);
  add(labelvalor1);

  labelvalor2 = new JLabel("Valor 2:");
  labelvalor2.setBounds(50,35,100,30);
  add(labelvalor2);

  labelresultado = new JLabel("Resultado:");
  labelvalor2.setBounds(120,80,100,30);
  add(labelresultado);

  textfieldvalor1 = new JTextField();
  textfieldvalor1.setBounds(120,10,150,20);
  add(textfieldvalor1);

  textfieldvalor2 = new JTextField();
  textfieldvalor2.setBounds(120,40,150,20);
  add(textfieldvalor2);

  botsumar = new JButton("Sumar");
  botsumar.setBounds(10,140,100,30);
  add(botsumar);
  botsumar.addActionListener(this);

  botcerrar = new JButton("Cerrar");
  botcerrar.setBounds(129,140,90,30);
  add(botcerrar);
  botcerrar.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e){
  
  if(e.getSource() == botsumar){
   int valor1 = 0, valor2 = 0, resultado = 0;
   
   valor1 = Integer.parseInt(textfieldvalor1.getText());
   valor2 = Integer.parseInt(textfieldvalor2.getText());

    labelresultado.setText("Resultado: " + resultado);
   }

   if(e.getSource() == botcerrar){
   System.exit(0);
   }
  }

  public static void main(String args[]){
  UsoParse formulario = new UsoParse();
  formulario.setBounds(0,0,300,220);
  formulario.setVisible(true);
  formulario.setResizable(false);
  formulario.setLocationRelativeTo(null);
  }
}