public abstract class Cuenta {

    private Cliente cliente;


    public Cuenta(Cliente cliente) {
        this.cliente = cliente;
    }

    public  abstract void depositar(Double monto);


    public abstract void extraer(Double monto);

    public abstract Double informarSaldo();
}
