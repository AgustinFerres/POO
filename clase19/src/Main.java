public class Main {
    public static void main(String[] args) {


        Empresa empresa = new Empresa("hola");


        try {
            empresa.agregarEmpleado(EmpleadoFactory.getInstance().crearEmpleado("EMP-RD"));
        } catch (EmpleadoFactoryException e) {
            e.printStackTrace();
        }
        try {
            empresa.agregarEmpleado(EmpleadoFactory.getInstance().crearEmpleado("EMP-PH"));
        } catch (EmpleadoFactoryException e) {
            e.printStackTrace();
        }


        System.out.println(empresa.calcularSueldosTotal(10));
    }
}