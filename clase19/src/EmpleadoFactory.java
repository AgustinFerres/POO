public class EmpleadoFactory {

    private static EmpleadoFactory instance;

    private EmpleadoFactory (){}

    public static EmpleadoFactory getInstance(){
        if (instance == null){
            instance = new EmpleadoFactory();
        }
        return instance;
    }

    public Empleado crearEmpleado(String codigo) throws EmpleadoFactoryException{
        switch (codigo){
            case "EMP-RD" :
                return new EmpleadoReleacionDependencia("pablo", "velez", 1, 1000.0);
            case "EMP-PH" :
                return new EmpleadoContratado("gaston", "innamorato", 2, 7.0, 0.14);
            default:
                throw new EmpleadoFactoryException("codigo no valido");
        }
    }
}
