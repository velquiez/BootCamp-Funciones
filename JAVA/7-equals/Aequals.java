import java.util.Scanner;

public class Aequals
{
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
  String usuario = "", eliminado = "";
  
  System.out.print(">>Nombre de usuario a buscar: ");
  usuario = in.nextLine();
  System.out.println("");
  System.out.print(">>Ultimo usuario eliminado de la plataforma: ");
  eliminado = in.nextLine();
  System.out.println("");

  if (usuario.equals(eliminado)){
     System.out.println("--El usuario buscado es el mismo al eliminado");}
  else{
     System.out.println("--El usuario no es mismo al ultimo eliminado");}
  
  System.out.println("");
  System.out.println("*Con equalsIgnoreCase no importa si hay alguna letra en mayuscula.");
  System.out.println("");

  if (usuario.equalsIgnoreCase(eliminado)){
     System.out.println("--El usuario buscado es el mismo al eliminado");}
  else{
     System.out.println("--El usuario no es mismo al ultimo eliminado");}
 }
}