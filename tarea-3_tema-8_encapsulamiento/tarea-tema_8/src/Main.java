public class Main {
    public static void main(String[] args) {

        Persona  person  = new Persona();
        person.setEdad(54);
        person.setNombre("Nelly");
        person.setTelefono(8334455);

        System.out.println(person.getNombre());
        System.out.println(person.getEdad());
        System.out.println(person.getTelefono());
    }
}