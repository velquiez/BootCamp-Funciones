import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numeroif = 0;

        Scanner escribe =  new Scanner(System.in);
        System.out.println("Digita un número, por favor:");

        numeroif = escribe.nextInt();

        if( numeroif < 0){
            System.out.println("El número es negativo");
        } else if (numeroif > 0) {
            System.out.println("El número es positivo");
        }else {
            System.out.println("El número es 0 - cero");
        }
    }
}