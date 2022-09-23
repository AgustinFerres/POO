public class Main {
    public static void main(String[] args) {


        Empresa lopi = new Empresa("soy lopi");


        lopi.agregarServicio(ServicioFactory.VENTA_AIRE_ACONDICIONADO);
        lopi.agregarServicio(ServicioFactory.COLOCACION_AIRE_ACONDICIONADO);
        lopi.agregarServicio(ServicioFactory.FULL_AIRE_ACONDICIONADO);

        lopi.mostrarServicios();
    }
}