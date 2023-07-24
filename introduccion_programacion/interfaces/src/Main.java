public class Main {
    public static void main(String[] args) {

          Auto miAuto = new Auto();
        ejecutarFrenar(miAuto);

    }
    public static void ejecutarFrenar(Vehiculo vehiculo){
        vehiculo.frenar(2);
    }
}

interface Vehiculo{
    void acelerar(int velocidad);
    void frenar(int velocidad);
}

class Auto implements Vehiculo{

    public void acelerar(int velocidad){
    int a = velocidad + 8;
    }

    public void frenar(int velocidad){
        int a = velocidad - 6;
        System.out.println(a);
    }
}