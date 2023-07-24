import java.util.Scanner;

public class Operaciones
{
 public static void main (String args[])
 {  
  Scanner in = new Scanner(System.in);
  String nombre = "";
  int numero1 = 0, numero2 = 0, resultado = 0, operacion = 0;

  System.out.println ("¿Cuál es tu nombre?");
  nombre = in.nextLine();

  System.out.println ("Digite el número uno: ");
  numero1 = in.nextInt();

  System.out.println ("Digite el número dos: ");
  numero2 = in.nextInt();

  System.out.print ("Tipo de operación: Suma-1, Resta-2, Multiplicación-3, División-4.");
  operacion = in.nextInt();

   if (operacion == 1)
   {
    resultado = numero1+numero2;
    System.out.println ("Hola " + nombre + " La suma de los números es: " + resultado);
   }
   else if (operacion == 2)
   {
    resultado = numero1-numero2;
    System.out.println ("Hola " + nombre + " La resta de los números es: " + resultado);
   }
   else if (operacion == 3)
   {
    resultado = numero1*numero2;
   System.out.println ("Hola " + nombre +" La multiplicación de los números es: " + resultado);
   }
   else if (operacion == 4)
   {
    resultado = numero1/numero2;
   System.out.println ("Hola " + nombre + " La división de los números es: " + resultado);
   }
   else 
   {
   System.out.println (" La opción que elegiste no existe.");
   }
 }
}