
import java.util.Scanner;

public class Prim
{
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
  int num = 0;
  double primo = 0;
  double rf = 0;
  int contador = 0;
  double k = 0; 
  double resul = 0;
  int c = 0;

   System.out.print("Escriba un numero:_");
    num = in.nextInt(); 
   
   k = num;

   if(num == 1){
               System.out.print("El numero " + num + " no se puede clasificar dentro de los primos o compuestos");
               }
   else{
            while(contador < num)
           {
                  double n1 = num;
                  double n2 = k;

                  primo = (n1 / n2);
               
              rf = Math.floor(primo);
               
              resul = primo - rf;
                             
              if(0 == resul){
                            c = c  + 1;
                            contador = contador + 1;

                            if(c > 2){
                                      System.out.println(  k + " ORIGEN " + primo);
                                      contador = contador + num;}
                            k = k - 1; 
                             
                            }
               else {
                      contador = contador + 1;
                      k = k - 1;    
                    } 
            }
              if(c > 2){
                        System.out.println(num + " <<<<NO ES PRIMO>>>> ");}
               else {
                     System.out.println(num + " <<<<ES PRIMO>>>> ");}  
            
        }
    }
}        