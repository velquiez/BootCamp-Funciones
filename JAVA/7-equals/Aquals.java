import java.util.Scanner;

public class Aquals
{
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
  String usuario = "velquiez", password = "1234";

  System.out.println("Nombre de Usuario: ");
  usuario = in.nextLine();
  System.out.println("Contrasena");
  password = in.nextLine();

  if (usuario.equals("velquiez") && password.equals("1234")){
   System.out.println(">>Los datos son correctos");}
  else{
   System.out.println(">>Datos incorrectos");}

  if (usuario.equalsIgnoreCase(password)){
   System.out.println("<<Los datos son iguales");}
  else{
   System.out.println("<<Los datos no son iguales");}
 }
}