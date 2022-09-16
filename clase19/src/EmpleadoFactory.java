public class EmpleadoFactory {


    public static final String CODIGO_CONTRATADO = "EMP-RD";
    public static final String CODIGO_DEPENDIENTE = "EMP-PH";
    private static EmpleadoFactory instance;

    private EmpleadoFactory (){}

    public static EmpleadoFactory getInstance(){
        if (instance == null){
            instance = new EmpleadoFactory();
        }
        return instance;
    }

    public Empleado crearEmpleado(String codigo) throws EmpleadoFactoryException{

        if (codigo == null){
            throw new EmpleadoFactoryException("el codigo no puede ser nulo");
        }

        switch (codigo){
            case CODIGO_CONTRATADO:
                return new EmpleadoReleacionDependencia("pablo", "velez", 1, 1000.0);
            case CODIGO_DEPENDIENTE:
                return new EmpleadoContratado("gaston", "innamorato", 2, 7.0, 0.14);
            default:
                throw new EmpleadoFactoryException(codigo + " no es un codigo valido");
        }
    }
}
