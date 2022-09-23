import java.util.ArrayList;
import java.util.List;

public class ServicioCombo extends Servicio{

    private Integer descuento;

    private List<Servicio> servicios;

    public ServicioCombo(String nombre, String descripcion, Integer descuento) {
        super(nombre, descripcion);
        this.descuento = descuento;
        servicios = new ArrayList<>();
    }

    @Override
    public Double calcularPrecio() {
        double precio = 0.0;

        for (Servicio servicio : servicios) {
            precio += servicio.calcularPrecio();
        }
        return precio - ((precio * descuento )/ 100);
    }


    public void agregarServicio(Servicio s){
        servicios.add(s);
    }
}
