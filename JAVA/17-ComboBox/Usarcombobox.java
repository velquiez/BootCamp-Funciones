import javax.swwing.*;
import java.awt.event.*;

public class Usarcombobox extends JFrame implements ItemListener{

private JLabel labelcolor;
private JComboBox comboboxcolor;

  public Usarcombobox(){
  setLayout(null);
  labelcolor = new JLabel("Color");
  labelcolor.setBounds(150,90,100,30);
  add(labelcolor);

  comboboxcolor = new JComboBox();
  comboboxcolor.setBounds(15,15,100,30);
  add(comboboxcolor);
  comboboxcolor.addItem("Negro");
  comboboxcolor.addItem("Blanco");
  comboboxcolor.addItem("Rojo");
  comboboxcolor.addItem("Azul");
  comboboxcolor.addItem("Amarillo");
  comboboxcolor.addItemListener(this);
  }

  public void itemStateChanged(ItemEvent e){
     if(e.getSource() == comboboxcolor){
     String seleccion = comboboxcolor.getSelectedItem().toString();
     setTitle(seleccion);
     labelcolor.setText(seleccion); 
     }
  }
 public static void main(String args[]){
 Usarcombobox formulario = new Usarcombobox();
 formulario.setBounds(0,0,200,150);
 formulario.setVisible(true);
 formulario.setResizable(false);
 formulario.setLocationRelativeTo(null);
 }

}