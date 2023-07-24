import java.util.Scanner;

public class Array{
  public static void main(String args []){
  
  Scanner in = new Scanner(System.in);
  int rango = 0, cantidad_letras = 0, numero_palabra = 0;
  String usuario = "", contrasena = "";

   
  System.out.println("Escriba usuario: ");
  usuario = in.nextLine();
  System.out.println("Escriba contraseña: ");
  contrasena = in.nextLine();
   
   if (usuario.equalsIgnoreCase("velquiez") && contrasena.equals("1234")){
   System.out.print("Datos correctos.");}
   else{
   System.out.print("Datos erróneos.");}

  System.out.print(" ");
  System.out.println("Digite el rango: "); 
  rango = in.nextInt();
  int array[] = new int[rango];

  for(int i = 0;i < array.length;i++){
  System.out.println("Digite el valor: " + (i+1) + " ");
  array[i] = in.nextInt();}
  
  for(int i = 0;i < array.length;i++){
  System.out.print("|" + array[i] + "|" + " ");} 

   System.out.println("Numero de caracteres: " + usuario.length());
   System.out.println("Corte desde-2 hasta-4: " + usuario.substring(2,4));
  }
}