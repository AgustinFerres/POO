public class CargaFactory {

    public static final String TV_32_LCD = "TV 32’ LCD'";
    public static final String CAJA_DE_MEDICAMENTOS = "caja de medicamentos'";
    public static final String CONTENEDOR = "Contenedor'";
    private static CargaFactory instance;

    private CargaFactory() {
    }

    public static CargaFactory getInstance() {
        if (instance == null){
            instance = new CargaFactory();
        }
        return instance;
    }

    public Carga crearCarga(String codigo) throws CargaFactoryException {
        if (codigo == null){
            throw new CargaFactoryException(codigo + " no puede ser nulo");
        }
        switch (codigo){
            case TV_32_LCD:
                return new CargaSimple("TV 32 pulgadas LCD", "tele 32 pulgadas", 3.0, false);
            case CAJA_DE_MEDICAMENTOS:
                return new CargaSimple("Caja de medicamentos", "variedad de medicamentos", 2.0, true);
            case CONTENEDOR:
                CargaContenedor c = new CargaContenedor("Contenedor", "contiene 1 tele de 32 y una caja de medicamentos.", 100.0);

                c.agregarCarga(crearCarga(TV_32_LCD));
                c.agregarCarga(crearCarga(CAJA_DE_MEDICAMENTOS));

                return c;
            default:
                throw new CargaFactoryException(codigo + " no es un codigo valido");
        }
    }
}
