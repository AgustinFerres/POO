public abstract class Pelicula {

    private Cine cine;
    private String nombre;
    private String clasificacion;
    private Double minutosDuracion;
    private String fechaFilmacion;
    private String nombreDirector;

    public Pelicula(Cine cine, String nombre, String clasificacion, Double minutosDuracion, String fechaFilmacion, String nombreDirector) {
        this.cine = cine;
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.minutosDuracion = minutosDuracion;
        this.fechaFilmacion = fechaFilmacion;
        this.nombreDirector = nombreDirector;
    }

    public Boolean aptaParaTodoPublico() {
        return clasificacion.toLowerCase().equals("atp");
    }
}
