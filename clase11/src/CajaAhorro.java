public class CajaAhorro extends Cuenta{

    private Double tasaInteres;

    private Double saldo;

    public CajaAhorro(Cliente cliente, Double saldo, Double tasaInteres) {
        super(cliente);
        this.saldo = saldo;
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositar(Double monto) {
        saldo += monto;
    }

    @Override
    public void extraer(Double monto) {
        if (monto < saldo){
            saldo -= monto;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void cobrarInteres(){
        saldo += saldo * tasaInteres;
    }

    @Override
    public Double informarSaldo() {
        return saldo;
    }
}
