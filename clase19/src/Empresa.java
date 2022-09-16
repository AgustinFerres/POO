import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String razonSocial;
    private List<Empleado> empleados;


    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        empleados = new ArrayList<>();
    }

    public  void agregarEmpleado(String codigoEmpleado){

        try {
            empleados.add(EmpleadoFactory.getInstance().crearEmpleado(codigoEmpleado));
        } catch (EmpleadoFactoryException e) {
            e.printStackTrace();
        }
    }

    public double calcularSueldosTotal(int dias){
        double total = 0.0;

        for(Empleado e : empleados){
            total += e.calcularSueldo(dias);
        }

        return total;
    }
}
