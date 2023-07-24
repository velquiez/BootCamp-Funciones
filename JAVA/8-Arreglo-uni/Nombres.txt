import java.util.Scanner;

public class Nombres{
 public static void main(String args[]){
 
 Scanner in = new Scanner(System.in);
 String palabra = "", usuario = "", contrasena = "";
 int rango = 0, contador = 1;

 System.out.print("Digite usuario: ");
 usuario = in.nextLine();
 System.out.print("Password: ");
 contrasena = in.nextLine();
  
  if(usuario.equalsIgnoreCase("velquiez") && contrasena.equals("1234"))
  {
    System.out.print("Digite cantidad de nombres a guardar: ");
    rango = in.nextInt();
    String arreglo[] = new String[rango];
    
     System.out.println("Escriba los nombres: ");
     for(int i = 0; i < arreglo.length;i++){
     System.out.print(contador + ":");
     palabra = in.nextLine();
     arreglo[i] = palabra;
     contador++;}

     System.out.println("");

     System.out.println("Las palabras guardadas son: ");
     for (int i = 0; i < arreglo.length; i++){
     System.out.println("- "  + arreglo[i]);
     }
   }
   else{
     System.out.println(" El usuario o contrasena son incorrectos: ");}
 
 }
}