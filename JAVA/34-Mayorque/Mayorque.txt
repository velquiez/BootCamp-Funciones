import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Mayorque extends JFrame implements ActionListener
{
private JMenuBar mb;
private JMenu calcular;
private JLabel l1, l2, l3;
private JTextField textfield1, textfield2;
private JTextArea txtarea;
private JScrollPane scrollpane1;
private JButton comparar;

 public Mayorque()
 {
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Mayor y menor que");
  
  l1 = new JLabel("Numero-uno");
   l1.setBounds(10,10,100,30);
    add(l1);

  l2 = new JLabel("Numero-dos");
   l2.setBounds(120,10,100,30);
    add(l2);

  l3 = new JLabel("Respuestas:");
   l3.setBounds(70,65,100,30);
    add(l3);
 
  textfield1 = new JTextField();
   textfield1.setBounds(10,40,100,30);
    add(textfield1);

  textfield2 = new JTextField();
   textfield2.setBounds(120,40,100,30);
    add(textfield2);

  txtarea = new JTextArea();
   txtarea.setFont(new Font("Arial", 1, 16));
  
  scrollpane1 = new JScrollPane(txtarea);
   scrollpane1.setBounds(10,90,215,90);
    add(scrollpane1);

  comparar = new JButton("Comparar");
   comparar.setBounds(70,190,110,30);
   comparar.addActionListener(this);
   add(comparar);
 }
 public void actionPerformed(ActionEvent e)
 {
  if(e.getSource() == comparar)
    {
    String cad1 = textfield1.getText().toString();
    String cad2 = textfield2.getText().toString();

    double nu1 = Double.parseDouble(cad1);
    double nu2 = Double.parseDouble(cad2);
    int identificador = 0;
    int canticad1 = 0;
    int canticad2 = 0;

    canticad1 = cad1.length();
    canticad2 = cad2.length();

    if(cad1.equals(cad2)){
    txtarea.setText("Los numeros son iguales.");
    }
    
    else if(nu1 == 0){
        txtarea.setText("Numero mayor: " + cad2 + "\nNumero menor: " + cad1);

    }

    else if(nu2 == 0){
        txtarea.setText("Numero mayor: " + cad1 + "\nNumero menor: " + cad2);

    }

    else if(canticad1 != canticad2){
    	while(canticad1 != 0){
    		if(canticad1 == canticad2){
    			identificador = 1;
    			canticad1 = 1;}
    			canticad1--;}

    	if(identificador == 1){
    	txtarea.setText("Numero mayor: " + cad1 + "\nNumero menor: " + cad2);}
    	else{
    	txtarea.setText("Numero mayor: " + cad2 + "\nNumero menor: " + cad1);}
    }

    else{      
    	while(nu1 != 0){
    	if(nu1 == nu2){
    	identificador = 1;
    	nu1 = 1;}
    	nu1--;}

    if(identificador == 1){
    txtarea.setText("Numero mayor: " + cad1 + "\nNumero menor: " + cad2);}
    else{
    txtarea.setText("Numero mayor: " + cad2 + "\nNumero menor: " + cad1);}
    }
   }
 }
 public static void main(String args[])
 {
  Mayorque formulario = new Mayorque();
   formulario.setBounds(0,0,250,260);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
 }
}