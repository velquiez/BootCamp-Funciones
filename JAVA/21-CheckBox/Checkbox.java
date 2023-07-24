import javax.swing.*;
import javax.swing.event.*;

public class Checkbox extends JFrame implements ChangeListener{

 private JCheckBox check1,check2,check3;
 private JButton cerrar;

 public Checkbox(){
  
  setLayout(null);
  
  check1 = new JCheckBox("Francés");
   check1.setBounds(15,15, 150,30);
   check1.addChangeListener(this);
   add(check1);

  check2 = new JCheckBox("Ingles");
   check2.setBounds(15,50,150,30);
   check2.addChangeListener(this);
   add(check2);
  
  check3 = new JCheckBox("Ruso");
   check3.setBounds(15,100,150,30);
   check3.addChangeListener(this);
   add(check3);

 }
  public void stateChanged(ChangeEvent e){
   String cad = "";
   
   if(check1.isSelected() == true){
     cad = cad + "Frances-";
   }
   if(check2.isSelected() == true){
     cad = cad + "Ingles-";
   }
   if(check3.isSelected() == true){
     cad = cad + "Ruso-";
   }
   setTitle(cad);
 }
  public static void main(String args[]){
    Checkbox formulario = new Checkbox();
    formulario.setBounds(0,0,350,200);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
  }
}