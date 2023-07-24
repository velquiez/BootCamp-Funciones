import java.util.Scanner;

public class RepasoAreglo
{
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
  int contador = 1, rango = 0, z = 0;
 
   System.out.print("Digite la cantidad de # a guardar: ");
   rango = in.nextInt();  

    do
     {
       if(rango < 1){
          z++;
          System.out.print("Digite de nuevo la cantidad: ");
          rango = in.nextInt();
          }
       else if(rango > 10){
          z++;
          System.out.print("Digite de nuevo la cantidad: ");
          rango = in.nextInt(); 
          }
       else{
            z = 0;}
      }
        while(z > 0);

   int arreglo[] = new int[rango];
   
   int c = 0;
   for(int i = 0; i < arreglo.length;i++)
   {
     System.out.println("Digite # " + contador + "-");
     arreglo[i] = in.nextInt();
     contador++;
   }
    
    contador = 1;
    c = 0;

   for(int i = 0; i < arreglo.length;i++)
   {
    System.out.print(contador + ".");
     System.out.println(arreglo[i]);
     contador++;
   }
 }
}