import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner escrib = new Scanner(System.in);
        System.out.println("Digita una estación del año:");
        String estacion = escrib.nextLine();

        switch (estacion.toLowerCase()){
            case "primavera":
                System.out.println("Escogiste la estación: PRIMAVERA");
                break;
            case "verano":
                System.out.println("Escogiste la estación: VERANO");
                break;
            case "otoño":
                System.out.println("Escogiste la estación: OTOÑO");
                break;
            case "invierno":
                System.out.println("Escogiste la estación: INVIERNO");
                break;
            default:
                System.out.println("NO EXISTE LA ESTACIÓN");
                break;
        }
    }
}