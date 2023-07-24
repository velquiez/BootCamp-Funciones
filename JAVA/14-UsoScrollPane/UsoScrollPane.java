import javax.swing.*;

public class UsoScrollPane extends JFrame{

private JTextArea textarea1;
private JTextField textfield1;
private JScrollPane scroll1;

 public UsoScrollPane(){
  setLayout(null);
  textfield1 = new JTextField();
  textfield1.setBounds(5,5,150,30);
  add(textfield1);

  textarea1 = new JTextArea();
  
  scroll1 = new JScrollPane(textarea1);
  scroll1.setBounds(5,35,300,250);
  add(scroll1);
 }
  public static void main(String args[]){
  UsoScrollPane formulario = new UsoScrollPane();
  formulario.setBounds(0,0,350,350);
  formulario.setVisible(true);
  formulario.setResizable(false);
  formulario.setLocationRelativeTo(null);
 }
}