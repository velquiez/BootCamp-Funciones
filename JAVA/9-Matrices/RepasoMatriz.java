import java.util.Scanner;

public class RepasoMatriz{

 public static void main(String args[]){

  Scanner in = new Scanner(System.in);
  int fila = 0, columna = 0, contador = 0, z = 0;
  String nombre = "";

  System.out.print("Cantidad de filas: ");
  fila = in.nextInt();

     do
     {
       if(fila < 1){
          z++;
          System.out.print("Cantidad de filas ni menor a 1 ni mayor a 3: ");
          fila = in.nextInt();
          }
       else if(fila > 3){
          z++;
          System.out.print("Cantidad de filas ni menor a 1 ni mayor a 3: ");
          fila = in.nextInt(); 
          }
       else{
            z = 0;}
      }
        while(z > 0); 

  System.out.print("Numero de Columnas: ");
  columna = in.nextInt();

     do
     {
       if(columna < 1){
          z++;
          System.out.print("Cantidad de columnas - ni menor a 1 ni mayor a 3: ");
          columna = in.nextInt();
          }
       else if(columna > 3){
          z++;
          System.out.print("Cantidad de columnas - ni menor a 1 ni mayor a 3: ");
          columna = in.nextInt(); 
          }
       else{
            z = 0;}
      }
        while(z > 0); 

  String matriz[][] = new String[fila][columna];

  for(int i = 0;i < fila;i++)
  {
    for(int j = 0;j < columna; j++)
    {
     System.out.print("Digite nombre: " + i + "." + j);
     nombre = in.nextLine();
     matriz[i][j] = nombre;
    }
   System.out.println("");
  }

  for(int i = 0;i < fila;i++)
  {
    for(int j = 0;j < columna; j++)
    {
     System.out.print(i + "." + j);
     System.out.println(matriz[i][j]);
    }
   System.out.println("");
   }
 }
}