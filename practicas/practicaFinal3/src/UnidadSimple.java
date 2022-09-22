public class UnidadSimple extends Unidad{

    private Double montoXPersona;
    private Integer cantidadPersonas;

    public UnidadSimple(String nombre, String descripcion, Double montoXPersona, Integer cantidadPersonas) {
        super(nombre, descripcion);
        this.montoXPersona = montoXPersona;
        this.cantidadPersonas = cantidadPersonas;
    }

    @Override
    public Double calcularMonto() {
        if (cantidadPersonas > 10){
            return montoXPersona * cantidadPersonas + (montoXPersona * cantidadPersonas * 0.2);
        }
        return montoXPersona * cantidadPersonas;
    }
}
