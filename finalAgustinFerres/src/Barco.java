import java.util.ArrayList;
import java.util.List;

public class Barco {

    private List<Carga> cargas;

    public Barco() {
        cargas =new ArrayList<>();
    }

    public void agregarCarga(String codigo){
        try {
            cargas.add(CargaFactory.getInstance().crearCarga(codigo));
        } catch (CargaFactoryException e) {
            e.printStackTrace();
        }
    }

    public void mostrarCargas(){
        for (Carga carga : cargas) {
            System.out.println(carga);
        }
    }
}
