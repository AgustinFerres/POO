public class EmpleadoReleacionDependencia extends Empleado{

    private  double sueldoMensual;

    public EmpleadoReleacionDependencia(String nombre, String apellido, int legajo, double sueldoMensual) {
        super(nombre, apellido, legajo);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo(int dias) {
        return (sueldoMensual * dias) / 30;
    }
}
