import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Unidad> unidades;

    public Empresa() {
        unidades = new ArrayList<>();
    }

    public void agregarUnidad(String codigo){
        try {
            unidades.add(UnidadFactory.getInstance().crearUnidad(codigo));
        } catch (UnidadFactoryException e) {
            e.printStackTrace();
        }
    }

    public void mostrarUnidades(){
        for (Unidad unidad : unidades) {
            System.out.println(unidad);
        }
    }
}
