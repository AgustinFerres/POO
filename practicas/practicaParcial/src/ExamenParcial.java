public class ExamenParcial extends Examen{

    private Integer numeroUnidad;
    private Integer reintentos;

    public ExamenParcial(Alumno alumno, String titulo, String enunciado, Double nota, Integer numeroUnidad, Integer reintentos) {
        super(alumno, titulo, enunciado, nota);
        this.numeroUnidad = numeroUnidad;
        this.reintentos = reintentos;
    }

    public Boolean puedeRecuperar(){

        if (numeroUnidad > 3){
            return reintentos < 2;
        }
        return reintentos < 3;
    }
}
