import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Usocheckbox extends JFrame implements ChangeListener, ActionListener{

   private JCheckBox checkbox1,checkbox2,checkbox3;
   private JButton cerrar;

  public Usocheckbox(){
   
    setLayout(null);

    checkbox1 = new JCheckBox("Frances");
    checkbox1.setBounds(15,15,150,30);
    checkbox1.addChangeListener(this);
    add(checkbox1);

    checkbox2 = new JCheckBox("Ruso");
    checkbox2.setBounds(15,50,150,30);
    checkbox2.addChangeListener(this);
    add(checkbox2);

    checkbox3 = new JCheckBox("Aleman");
    checkbox3.setBounds(15,100,150,30);
    checkbox3.addChangeListener(this);
    add(checkbox3);

    cerrar = new JButton("Cerrar");
    cerrar.setBounds(80,130,100,30);
    cerrar.addActionListener(this);
    add(cerrar);
  }

     public void stateChanged(ChangeEvent e){

     String cad = "";

     if(checkbox1.isSelected() == true){
      cad = cad + "Frances-";
      }

     if(checkbox2.isSelected() == true){
       cad = cad + "Ruso-";
      }

     if(checkbox3.isSelected() == true){
       cad = cad + "Aleman-";
      }

      setTitle(cad);
    }
    
    public void actionPerformed(ActionEvent evento){
           if(evento.getSource() == cerrar){
       System.exit(0);
      }     
    }

   public static void main(String[] args){
   Usocheckbox formulario = new Usocheckbox();
   formulario.setBounds(0,0,350,200);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
}
}