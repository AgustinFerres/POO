import java.util.ArrayList;
import java.util.List;

public class Instituto {

    private List<OfertaAcademica> ofertas;

    public Instituto() {
        ofertas = new ArrayList<>();
    }

    public void agregarOfertas(String codigo){
        try {
            ofertas.add(OfertaAcademicaFactory.getInstance().crearOfertaAcademica(codigo));
        } catch (OfertaAcademicaFactoryException e) {
            e.printStackTrace();
        }
    }

    public void generarInforme(){
        for (OfertaAcademica oferta : ofertas) {
            System.out.println(oferta);
        }
    }
}
