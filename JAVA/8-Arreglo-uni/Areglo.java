import java.util.Scanner;

public class Areglo
{
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
  String nombres = "";
  int contador = 1, rango = 0, z = 0;
 
   System.out.print("Digite el numero de usuarios a guardar: ");
   rango = in.nextInt();  

    do
     {
       if(rango < 1){
          z++;
          System.out.print("Digite el numero de usuarios a guardar: ");
          rango = in.nextInt();
          }
       else if(rango > 10){
          z++;
          System.out.print("Digite el numero de usuarios a guardar: ");
          rango = in.nextInt(); 
          }
       else{
            z = 0;}
      }
        while(z > 0);

   String arreglo[] = new String[rango];
   
   for(int i = 0; i < arreglo.length;i++)
   {
     System.out.println("");
     System.out.println("Digite el usuario " + contador + "-");
     arreglo[i] = in.nextLine();
     contador++;
   }
    
    contador = 1;

   for(int i = 0; i < arreglo.length;i++)
   {
    System.out.print(contador + ".");
     System.out.println(arreglo[i]);
     contador++;
   }
 }
}