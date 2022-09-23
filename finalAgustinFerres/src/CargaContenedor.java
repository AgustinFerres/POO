import java.util.ArrayList;
import java.util.List;

public class CargaContenedor extends Carga{

    private Double pesoContenedor;
    private List<Carga> cargas;

    public CargaContenedor(String nombre, String descripcion, Double pesoContenedor) {
        super(nombre, descripcion);
        this.pesoContenedor = pesoContenedor;
        cargas = new ArrayList<>();
    }

    public void agregarCarga(Carga carga){
        cargas.add(carga);
    }

    @Override
    public Double calcularPeso() {
        double pesoCargas = 0.0;
        for (Carga carga : cargas) {
            pesoCargas += carga.calcularPeso();
        }
        return pesoContenedor + pesoCargas;
    }
}
