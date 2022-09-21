public class Main {
    public static void main(String[] args) {
        Instituto digitial = new Instituto();

        digitial.agregarOfertas(OfertaAcademicaFactory.CODIGO_FRONT);
        digitial.agregarOfertas(OfertaAcademicaFactory.CODIGO_BACK);
        digitial.agregarOfertas(OfertaAcademicaFactory.CODIGO_FULL_STACK);


        digitial.generarInforme();
    }
}