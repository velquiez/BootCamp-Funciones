import java.util.Scanner;

public class Login
{
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
  String usuario = "velquiez", password = "1234";

  System.out.print("Nombre de usuario: ");
  usuario = in.nextLine();
  System.out.print("Contraseña: ");
  password = in.nextLine();

  if (usuario.equals("velquiez") && password.equals("1234")){
    System.out.print("Datos correctos.");}
  else{
    System.out.print("Usuario o contraseña incorrectos");}
 }
}