import java.util.Scanner;

public class Primensayo
{
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
  int num = 0;
  double primo = 0;
  double rf = 0;
  int contador = 0;
  int k = 0; 
  int d = 0;
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
               
              String cad = String.valueOf(primo);
               
                 System.out.println("Resultado division: " + cad);
         
              int cantidad = cad.length();
               
                   System.out.println("Cantidad caracteres: " + cantidad);                 
 
              c = cantidad - 1;
              String w = "0";
              String q = ",";

           for(int i = cantidad; i <= 0; i--)
           {
                                     
                       String recorte = cad.substring(i,c);
                        System.out.println(" Recorte: " + cad);
                    
                       if(recorte.equals(w))
                          {c = c - 1;
                           d = d + 1;
                          }
                       if(recorte.equals(q))
                          {c = c - 1;
                           d = d + 1;
                          }
 
                        if (d == 2)
                           {
                             i = 0;
                           }
                 
             }

                    if(2 == d){
                                    System.out.println("<<<<NO PRIMO>>>> ");
                                    System.out.println( k + " ORIGEN " + primo );
                                     contador = contador + num;                         
                              }
                     else {
                            contador = contador + 1;
                            k = k - 1;    
                          } 
           
           } 
            if(d < 2) {System.out.println("<<<<ES PRIMO>>>> ");}  
        }
    }
}   
