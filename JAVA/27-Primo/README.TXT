------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:


import java.util.Scanner;

public class Prim
{
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
  int num = 0;
  float primo = 0;
  int noprimo = 0;
  int contador = 0;
  int k = 0, g = 0;

   System.out.print("Escriba un numero:_");
    num = in.nextInt(); 
   
   k = num;
   g = num;

   if(num == 1){
               System.out.print("El numero " + num + " no se puede clasificar dentro de los primos o compuestos");
               }
   else{
            while(contador < num)
           {
                  float n1 = num;
                  float n2 = k;

                  primo = (n1 / n2);     

                 String conver = String.valueOf(primo);
                 
                 int cad = conver.length();
                 System.out.println("cantidad: " + cad);
                 
                 int c = 1;
                 String y = ".";
                 String z = "0";
                 
                 for(int i = 0; i < cad; i++)
                 {                                  
                   System.out.println("El corte es: " + conver.substring(0,c) + "_");
                    
                   String v = conver;
                   
                    if(v == y)
                                  {noprimo = noprimo + 1;}
                    if(v == z)
                                   {noprimo = noprimo + 1;}
                    c = c + 1; 
                    
                    System.out.println("No primo suma: " +  noprimo + " <<<<<<<<");
                    
                     if (noprimo == 2) {i = cad;}
                 }
                                     
                    if (noprimo == 2) {
                        System.out.println(">>>>No es primo");
                        contador = g;}
                    else {System.out.println(">>>Es Primo");
                               System.out.println( k + " $$$ " + primo );
                                contador = contador + 1;
                                k = k - 1;    
                    }
                    

            }
            
        }
    }
}  