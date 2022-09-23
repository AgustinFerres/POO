public class ServicioFactory {

    public static final String VENTA_AIRE_ACONDICIONADO = "Venta Aire Acondicionado";
    public static final String COLOCACION_AIRE_ACONDICIONADO = "Colocacion Aire Acondicionado";
    public static final String FULL_AIRE_ACONDICIONADO = "Full Aire Acondicionado";
    private static ServicioFactory instance;

    private ServicioFactory() {
    }

    public static ServicioFactory getInstance() {
        if (instance == null){
            instance = new ServicioFactory();
        }
        return instance;
    }

    public Servicio crearServicio(String codigo) throws ServicioFactoryException{
        if (codigo == null){
            throw new ServicioFactoryException(codigo + " el codigo no puede ser nulo");
        }
        switch (codigo){
            case VENTA_AIRE_ACONDICIONADO:
                return new ServicioSimple(VENTA_AIRE_ACONDICIONADO, "hola", 65000.0, false);
            case COLOCACION_AIRE_ACONDICIONADO:
                return new ServicioSimple(COLOCACION_AIRE_ACONDICIONADO, "hola", 10000.0, true);
            case FULL_AIRE_ACONDICIONADO:
                ServicioCombo c = new ServicioCombo(FULL_AIRE_ACONDICIONADO, "hola", 10);

                c.agregarServicio(crearServicio(VENTA_AIRE_ACONDICIONADO));
                c.agregarServicio(crearServicio(COLOCACION_AIRE_ACONDICIONADO));

                return c;
            default:
                throw new ServicioFactoryException(codigo + " no es un codigo valido");
        }
    }
}
