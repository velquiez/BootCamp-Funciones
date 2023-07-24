public class Main {
    public static void main(String[] args) {

        Automovil miAuto = new Automovil();
        System.out.println(miAuto.getRuido());
    }
}

abstract class Vehiculo {

    private int sonido;


    public Vehiculo( ){
        System.out.println("Soy el constructor de la clase vehiculo");
    }

    abstract public int getSonido();
    abstract public void setRuido(String ruido);
    abstract public String getRuido();
}

class Automovil extends Vehiculo{

    String ruidos = "Produzco extruendo";

    @Override
    public int getSonido() {
        return 6;
    }
    @Override
    public void setRuido(String ruido) {

    }

    @Override
    public String getRuido() {
        return ruidos ;
    }
}