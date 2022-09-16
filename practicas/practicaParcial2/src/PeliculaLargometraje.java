public class PeliculaLargometraje extends Pelicula
    implements Comparable{

    private String tema;
    private Integer cantidadActoresPrincipales;

    public PeliculaLargometraje(Cine cine, String nombre, String clasificacion, Double minutosDuracion, String fechaFilmacion, String nombreDirector, String tema, Integer cantidadActoresPrincipales) {
        super(cine, nombre, clasificacion, minutosDuracion, fechaFilmacion, nombreDirector);
        this.tema = tema;
        this.cantidadActoresPrincipales = cantidadActoresPrincipales;
    }

    @Override
    public int compareTo(Object o) {

        PeliculaLargometraje otroLargometraje = (PeliculaLargometraje) o;

        return this.cantidadActoresPrincipales - otroLargometraje.cantidadActoresPrincipales;
    }
}
