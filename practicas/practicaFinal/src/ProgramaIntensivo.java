import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica{

    private List<OfertaAcademica> cursos;
    private Double bonificacion;

    public ProgramaIntensivo(String nombre, String descripcion, Double bonificacion) {
        super(nombre, descripcion);
        this.bonificacion = bonificacion;
        cursos = new ArrayList<>();
    }

    public void agregarCurso(OfertaAcademica curso){
        cursos.add(curso);
    }

    @Override
    public Double calcularPrecio() {
        double precio = 0.0;

        for (OfertaAcademica curso : cursos) {
            precio += curso.calcularPrecio();
        }

        return precio - (precio * bonificacion);
    }
}
