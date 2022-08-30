public class CuentaCorriente extends Cuenta{

    private Double montoGiroAutorizado;

    private Double saldo;

    public CuentaCorriente(Cliente cliente, Double saldo, Double montoGiroAutorizado) {
        super(cliente);
        this.saldo = saldo;
        this.montoGiroAutorizado = montoGiroAutorizado;
    }

    @Override
    public void depositar(Double monto) {
        saldo += monto;
    }

    @Override
    public void extraer(Double monto) {
        if (monto <= saldo){
            saldo -= monto;
        } else if (monto < montoGiroAutorizado) {
            saldo -= monto;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public Double informarSaldo() {
        return saldo;
    }
}
