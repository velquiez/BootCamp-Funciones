package lavadora_uno;
import Libreria.LLFunciones;
import java.util.Scanner;


public class Lavadora_Uno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿La ropa es blanca o de color?");
        System.out.println("Presiona 1 - ropa blanca / 2 - ropa color ");
        int TipoDeRopa = entrada.nextInt();
        
        System.out.println("¿Cuantos kilos de ropa?");
        int kilos = entrada.nextInt();
        
        LLFunciones mensajero = new LLFunciones(kilos, TipoDeRopa);
        mensajero.CicloFinalizado();
    }
}
