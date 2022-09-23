public abstract class Carga {

    private String nombre;
    private String descripcion;

    public Carga(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPeso();

    @Override
    public String toString() {
        return nombre + " " + calcularPeso() + " Kg";
    }
}
