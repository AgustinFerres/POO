public class Curso extends OfertaAcademica{

    private Integer horasMensuales;
    private Double duracionMesses;
    private Double precioXHora;

    public Curso(String nombre, String descripcion, Integer horasMensuales, Double duracionMesses, Double precioXHora) {
        super(nombre, descripcion);
        this.horasMensuales = horasMensuales;
        this.duracionMesses = duracionMesses;
        this.precioXHora = precioXHora;
    }

    @Override
    public Double calcularPrecio() {
        return horasMensuales * duracionMesses *precioXHora;
    }

    public Double getDuracionMesses() {
        return duracionMesses;
    }
}
