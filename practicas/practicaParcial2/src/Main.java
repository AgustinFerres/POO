public class Main {
    public static void main(String[] args) {


        Cine cine = new Cine("Movie", "Montevideo Shopping", 100);

        Pelicula peliculaLargometraje = new PeliculaLargometraje(cine, "Interstellar", "ATP", 120.0, "17/08/218", "Pablo", "Ciencia Ficcion", 7);

        Pelicula peliculaCortometraje = new PeliculaCortometraje(cine, "Blue", "ATP", 7.5, "20/1/2020", "DK", "Extranjera");


        PeliculaLargometraje largometraje = (PeliculaLargometraje) peliculaLargometraje;

        PeliculaCortometraje cortometraje = (PeliculaCortometraje) peliculaCortometraje;


        System.out.println(cortometraje.esNacional());
    }
}