public abstract class Empleado {

    private String nombre;
    private String apellido;
    private int legajo;

    public Empleado(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public abstract double calcularSueldo(int dias);
}
