public class Test {
    public static void main(String[] args) {

        Barco barco = new Barco();

        barco.agregarCarga(CargaFactory.TV_32_LCD);
        barco.agregarCarga(CargaFactory.CAJA_DE_MEDICAMENTOS);
        barco.agregarCarga(CargaFactory.CONTENEDOR);

        barco.mostrarCargas();
    }
}