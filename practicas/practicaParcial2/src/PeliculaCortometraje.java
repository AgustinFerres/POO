public class PeliculaCortometraje extends  Pelicula{

    private String origen;

    public PeliculaCortometraje(Cine cine, String nombre, String clasificacion, Double minutosDuracion, String fechaFilmacion, String nombreDirector, String origen) {
        super(cine, nombre, clasificacion, minutosDuracion, fechaFilmacion, nombreDirector);
        this.origen = origen;
    }

    public Boolean esNacional(){
        return origen.toLowerCase().equals("nacional");
    }
}
