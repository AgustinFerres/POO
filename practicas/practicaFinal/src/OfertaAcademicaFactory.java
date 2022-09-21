public class OfertaAcademicaFactory {


    public static final String CODIGO_FRONT = "Front End";
    public static final String CODIGO_BACK = "Back End";
    public static final String CODIGO_FULL_STACK = "Full Stack";
    private static OfertaAcademicaFactory instance;

    private OfertaAcademicaFactory() {
    }

    public static OfertaAcademicaFactory getInstance() {
        if (instance == null){
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }

    public OfertaAcademica crearOfertaAcademica(String codigo) throws OfertaAcademicaFactoryException {
        if (codigo == null){
            throw new OfertaAcademicaFactoryException(" no puede ser nulo pibe, q te pensas");
        }
        switch (codigo){
            case CODIGO_FRONT :
                return new Curso(CODIGO_FRONT, "Curso", 16, 2.0, 1000.0);
            case CODIGO_BACK:
                return new Curso(CODIGO_BACK, "Curso", 20, 2.0, 900.0);
            case CODIGO_FULL_STACK:
                ProgramaIntensivo FULL_STACK = new ProgramaIntensivo(CODIGO_FULL_STACK, "Programa Intensivo", 0.2);

                FULL_STACK.agregarCurso(new Curso(CODIGO_FRONT, "Curso", 16, 2.0, 1000.0));
                FULL_STACK.agregarCurso(new Curso(CODIGO_BACK, "Curso", 20, 2.0, 900.0));

                return FULL_STACK;
            default:
                throw new OfertaAcademicaFactoryException(codigo + " no es un codigo valido");

        }
    }
}
