import java.util.Scanner;

public class Validardato
{
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
  int dato = 0, x = 1, z = 0;
  String nombre = "";
   
     System.out.println("Digite nombre: ");
       nombre = in.nextLine(); 
     System.out.print("Ingrese numero de 1 a 10: ");
       dato = in.nextInt();
          
    do
     {
       if(dato < 1){
          z++;
           System.out.print("Ingrese numero de 1 al 10: ");
            dato = in.nextInt();}
       else if(dato > 10){
          z++;
           System.out.print("Ingrese numero de 1 al 10: ");
            dato = in.nextInt();}
       else{
            z = 0;}
      }
        while(z > 0);

   System.out.print("Hola " + nombre + "su numero fue: " + dato);
 }
}