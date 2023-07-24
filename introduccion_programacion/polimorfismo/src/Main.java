public class Main {
    public static void main(String[] args) {

        Hija mihija = new Hija();

        mihija.sumaNumeros(6,8);

        int k = mihija.a;
        double h = mihija.b;

        mihija.sumaNumeros(h,k);
    }
}

class Base{

    int a = 4;
    double b = 3.5;

}

class Hija extends Base{

    public int sumaNumeros(int a, int b){
        System.out.println("Soy el sumaNumeros de int");
       return a + b;
    }

    public float sumaNumeros(float a, float b){
        System.out.println("Soy el sumaNumeros de float");
        return a + b * (float)2.1;
    }
    public void sumaNumeros(double a, int b){
        System.out.println("Soy el sumaNumeros de double e int");
        System.out.println(a + b);
    }
}