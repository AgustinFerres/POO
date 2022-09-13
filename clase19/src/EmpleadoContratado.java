public class EmpleadoContratado  extends Empleado{

    private  double importePorHora;
    private  double retencionImpuesto;

    public EmpleadoContratado(String nombre, String apellido, int legajo, double importePorHora, double retencionImpuesto) {
        super(nombre, apellido, legajo);
        this.importePorHora = importePorHora;
        this.retencionImpuesto = retencionImpuesto;
    }

    @Override
    public double calcularSueldo(int dias) {
        double sueldoSinRetencion = (dias * 8) * importePorHora;

        return sueldoSinRetencion - sueldoSinRetencion * retencionImpuesto;
    }
}
