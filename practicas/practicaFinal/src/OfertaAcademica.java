public abstract class OfertaAcademica {

    private String nombre;

    private String descripcion;

    public OfertaAcademica(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPrecio();

    @Override
    public String toString() {
        return this.getClass().toString().replaceAll("class", "") + " " + nombre + ": $" + calcularPrecio().toString() + "\n";
    }
}