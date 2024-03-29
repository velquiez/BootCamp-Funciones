import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Usarmenubar extends JFrame implements ActionListener{

 private JMenuBar menubar;
 private JMenu menu1;
 private JMenuItem menuitem1,menuitem2,menuitem3;
 private JButton cerrar;

   public Usarmenubar(){
    setLayout(null);
    menubar = new JMenuBar();
    setJMenuBar(menubar);

    menu1 = new JMenu("Opciones");
    menubar.add(menu1);

    menuitem1 = new JMenuItem("Red");
    menuitem1.addActionListener(this);
    menu1.add(menuitem1);

    menuitem2 = new JMenuItem("Green");
    menuitem2.addActionListener(this);
    menu1.add(menuitem2);

    menuitem3 = new JMenuItem("Rojo");
    menuitem3.addActionListener(this);
    menu1.add(menuitem3);

    cerrar = new JButton("Cerrar");
    cerrar.setBounds(15,100,100,30);
    add(cerrar);
    cerrar.addActionListener(this);
   }

  public void actionPerformed(ActionEvent e){

   Container fondo = this.getContentPane();

    if(e.getSource() == menuitem1){
     fondo.setBackground(new Color(255,0,0));
    }
    if(e.getSource() == menuitem2){
      fondo.setBackground(new Color(0,255,0));
    }
    if(e.getSource() == menuitem3){
     fondo.setBackground(new Color(0,0,255));
    }
    if(e.getSource() == cerrar){
     System.exit(0);
     }
  }

  public static void main(String[] args){
   Usarmenubar formulario = new Usarmenubar();
   formulario.setBounds(0,0,300,250);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);

  }
}