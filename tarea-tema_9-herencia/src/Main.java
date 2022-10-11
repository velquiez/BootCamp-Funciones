public class Main {
    public static void main(String[] args) {

        Cliente cliente  = new Cliente();
        cliente.telefono = 8331564;
        cliente.edad = 88;
        cliente.nombre = "Humberto";
        cliente.setCredito(120.4);

        System.out.println("Nombre:"+cliente.nombre);
        System.out.println("Edad:"+cliente.edad);
        System.out.println("Teléfono:"+cliente.telefono);
        System.out.println("Crédito:"+cliente.getCredito());

        Trabajador trabajador  = new Trabajador();
        trabajador.telefono = 25564641;
        trabajador.edad = 15;
        trabajador.nombre = "Nelly";
        trabajador.setSalario(89.4);

        System.out.println("******************");
        System.out.println("Nombre:"+trabajador.nombre);
        System.out.println("Edad:"+trabajador.edad);
        System.out.println("Teléfono:"+trabajador.telefono);
        System.out.println("Salario:"+trabajador.getSalario());
    }
}