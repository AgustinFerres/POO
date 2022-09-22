import java.util.ArrayList;
import java.util.List;

public class UnidadCombinada extends Unidad{

    private Double coeficienteGlobal;
    private List<Unidad> unidades;


    public UnidadCombinada(String nombre, String descripcion, Double coeficienteGlobal) {
        super(nombre, descripcion);
        this.coeficienteGlobal = coeficienteGlobal;
        unidades = new ArrayList<>();
    }

    public void agregarUnidad(Unidad u){
        unidades.add(u);
    }

    @Override
    public Double calcularMonto() {
        double monto = 0;

        for (Unidad unidad : unidades) {
            monto += unidad.calcularMonto();
        }

        return monto * coeficienteGlobal;
    }
}
