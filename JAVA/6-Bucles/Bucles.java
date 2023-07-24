import java.util.Scanner;

public class Bucles 
{
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
  String nombre = "";
  int i = 0,rango = 0;
 
  System.out.println("Escriba su nombre: ");
  nombre = in.nextLine();
  System.out.println("Digite el rango: ");
  rango = in.nextInt();
   System.out.print("Hola " + nombre + " su serie es: ");

  for (i = 0; i <=rango; i++)
  {
   if (i < rango)
   {
    System.out.print( i + ",");
   }else{
    System.out.print(i);} 
  }

  i = 0;
  System.out.println("");
  System.out.println("");

  	while (i <= rango)
	  {
	    if (i < rango)
	   {
	    System.out.print( i + ",");
	   }else{
	    System.out.print(i);
	   } 
	   i++;
	  }
  
   i = 0;
   System.out.println("");
    System.out.println("");

   	do 
	   {
	    System.out.print(i + ",");
	    i++;
	   }
	   while (i < rango);
 }
} 