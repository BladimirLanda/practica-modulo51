
public class ProyectoSimple {

    private int edad;
    private String name;

    public ProyectoSimple(int edad, String name) {
        this.edad = edad;
        this.name = name;
    }

    public String metodo() {
        return "El nombre ingresado es: " + name + " y la edad es de: " + edad;
    }

}
