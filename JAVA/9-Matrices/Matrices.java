import java.util.Scanner;

public class Matrices{
 public static void main(String args[]){

  Scanner in = new Scanner(System.in);
  String nombres = "";
  int filas = 0, columnas = 0;

  System.out.print("Digite el numero de filas: ");
  filas = in.nextInt();
  System.out.print("Digite el numero de columnas: ");
  columnas = in.nextInt();

  String matriz[][] = new String[filas][columnas];

   for(int i = 0; i < filas; i++){
      
      for(int j = 0; j < columnas; j++){
      System.out.print("Escriba nombre: " + (i+1) + "." + (j+1));
      nombres = in.nextLine();
      matriz[i][j] = nombres;
      }
    System.out.println("");
   }
   for(int i = 0; i < filas; i++){
      
      for(int j = 0; j < columnas; j++){
      System.out.print((i+1) + "." + (j+1));
      System.out.print(matriz[i][j]);
      }
    System.out.println("");
    }
 }
}