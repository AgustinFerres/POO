public abstract class VacunaStrategy {

    private String nombre;
    private String origen;
    private Integer cantidadDosis;
    private String detalle;

    public VacunaStrategy(String nombre, String origen, Integer cantidadDosis, String detalle) {
        this.nombre = nombre;
        this.origen = origen;
        this.cantidadDosis = cantidadDosis;
        this.detalle = detalle;
    }

    public Integer calcularCantidadDosis(Integer cantidadDosisPaciente){
        return cantidadDosis - cantidadDosisPaciente;
    }

    public String getDetalle() {
        return detalle;
    }

    public Integer getCantidadDosis() {
        return cantidadDosis;
    }


}
