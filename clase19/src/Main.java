public class Main {
    public static void main(String[] args) {


        Empresa empresa = new Empresa("hola");


        empresa.agregarEmpleado(null);
        empresa.agregarEmpleado(EmpleadoFactory.CODIGO_CONTRATADO);
        empresa.agregarEmpleado(EmpleadoFactory.CODIGO_DEPENDIENTE);
        empresa.agregarEmpleado(EmpleadoFactory.CODIGO_DEPENDIENTE);
        empresa.agregarEmpleado("132331");
        empresa.agregarEmpleado(EmpleadoFactory.CODIGO_CONTRATADO);


        System.out.println(empresa.calcularSueldosTotal(10));
    }
}