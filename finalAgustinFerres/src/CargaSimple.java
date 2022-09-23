public class CargaSimple extends Carga{

    private Double pesoCarga;
    private Boolean necesitaRefrigeracion;

    public CargaSimple(String nombre, String descripcion, Double pesoCarga, Boolean necesitaRefrigeracion) {
        super(nombre, descripcion);
        this.pesoCarga = pesoCarga;
        this.necesitaRefrigeracion = necesitaRefrigeracion;
    }

    @Override
    public Double calcularPeso() {
        if (necesitaRefrigeracion){
            return pesoCarga * 1.1;
        }
        return pesoCarga;
    }
}
