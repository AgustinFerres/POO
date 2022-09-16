public class ExamenFinal extends  Examen
    implements Comparable{

    private Double notaOral;
    private String descripcionTemaOral;

    public ExamenFinal(Alumno alumno, String titulo, String enunciado, Double nota, Double notaOral, String descripcionTemaOral) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcionTemaOral = descripcionTemaOral;
    }

    @Override
    public int compareTo(Object o) {

        ExamenFinal otroFinal = (ExamenFinal) o;

        if (this.promedio() > otroFinal.promedio()){
            return 1;
        }else if (this.promedio() < otroFinal.promedio()){
            return  -1;
        }
        return  0;
    }

    @Override
    public Boolean estaAprobado() {
        return super.estaAprobado() && notaOral >= 4;
    }

    private Double promedio(){
        return ((getNota() + notaOral) / 2 );
    }

    public Double getNotaOral() {
        return notaOral;
    }
}
