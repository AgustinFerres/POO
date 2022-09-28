public class Oferente implements Observer{

    private String nombre;
    private String apellido;
    private String dni;
    private Double montoTope;

    public Oferente(String nombre, String apellido, String dni, Double montoTope) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.montoTope = montoTope;
    }

    @Override
    public void actualizar(Subasta s) {
        if (s.getMonto() < montoTope){
            System.out.println(nombre + " pone " + montoTope + " pesos.");
            s.setMonto(montoTope);
        }else {
            System.out.println(nombre + " se baja de la subasta");
        }
    }

    public Double getMontoTope() {
        return montoTope;
    }
}
