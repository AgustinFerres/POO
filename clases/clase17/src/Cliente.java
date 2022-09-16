public class Cliente {

    private  String nombre;
    private  String apellido;
    private  String dni;
    private  double deuda;
    private  double limite;


    public Cliente(String nombre, String apellido, String dni, double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.deuda = 0.0;
        this.limite = limite;
    }

    public  void comprar(double importe) throws ClienteException{
        if (importe > limite){
            throw new ClienteException("El valor supera su limite");
        }
        deuda += importe;
    }

    public  void saldarDeuda(double importe) throws ClienteException{
        if (deuda <= 0.0){
            throw new ClienteException("No tiene deuda a saldar");
        }
        if (importe > deuda){
            throw new ClienteException("Sos pelotudo o queres pagar mas?");
        }
        deuda -= importe;
    }
}
