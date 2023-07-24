import java.util.Scanner;

public class Arrays{

public static void main(String args[]){
 
 Scanner in = new Scanner(System.in);
 int rango = 0;
 
  System.out.println("Digite la cantidad de datos a guardar: ");
  rango = in.nextInt();

  int arrays [] = new int [rango];

  for(int i = 0; i < arrays.length;i++){
  System.out.print ("Digite valor " + (i+1) + " ");
  arrays[i] = in.nextInt();}

  for(int i = 0; i < arrays.length;i++){
  System.out.print(arrays[i] + "-");} 
 }
}