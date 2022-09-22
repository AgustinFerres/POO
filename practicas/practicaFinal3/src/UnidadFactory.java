public class UnidadFactory {

    public static final String MANTENIMIENTO = "Mantenimiento";
    public static final String LIMPIEZA = "Limpieza";
    public static final String SERVICIOS_GENERALES = "Servicios Generales";
    private static UnidadFactory instance;

    private UnidadFactory(){}

    public static UnidadFactory getInstance() {
        if (instance == null){
            instance = new UnidadFactory();
        }
        return instance;
    }

    public Unidad crearUnidad(String codigo) throws  UnidadFactoryException{
        if (codigo == null){
            throw new UnidadFactoryException(codigo + " no puede ser nulo");
        }
        switch (codigo){
            case MANTENIMIENTO:
                return new UnidadSimple(MANTENIMIENTO, "sad", 120000.0, 4);
            case LIMPIEZA:
                return new UnidadSimple(LIMPIEZA, "sad", 100000.0, 24);
            case SERVICIOS_GENERALES:
                UnidadCombinada u = new UnidadCombinada(SERVICIOS_GENERALES, "sad", 3.0);

                u.agregarUnidad(crearUnidad(MANTENIMIENTO));
                u.agregarUnidad(crearUnidad(LIMPIEZA));

                return u;
            default:
                throw new UnidadFactoryException(codigo + " no es un codigo valido");
        }
    }
}
