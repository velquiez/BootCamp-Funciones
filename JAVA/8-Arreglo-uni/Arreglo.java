import java.util.Scanner;
   Scanner in = new Scanner(System.in);
   int rango = 0, dato = 0, i = 0, posicion = 1;
      
   System.out.println("Escriba el rango del arreglo: ");  
   rango = in.nextInt(); 
   int arreglo[] = new int[rango];

   for (i = 0; i <= rango - 1; i++){
   System.out.print("Digite el dato de la posicion: " + posicion + ": ");
   dato = in.nextInt();
   arreglo[i] = dato;
   posicion = posicion + 1;}
   
   posicion = 1;
   for (i = 0; i <= rango - 1; i++){ 
      System.out.println("Los datos ingresados en la posicion " + posicion + " fue: " + arreglo[i]);
   posicion = posicion + 1;}
 }
}