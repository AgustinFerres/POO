public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        empresa.agregarUnidad(UnidadFactory.MANTENIMIENTO);
        empresa.agregarUnidad(UnidadFactory.LIMPIEZA);
        empresa.agregarUnidad(UnidadFactory.SERVICIOS_GENERALES);

        empresa.mostrarUnidades();
    }
}