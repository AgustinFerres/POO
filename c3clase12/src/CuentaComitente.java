public class CuentaComitente extends Cuenta{

    private String cnv;

    public CuentaComitente(Cliente titular, Double saldo, String cnv) {
        super(titular, saldo);
        this.cnv = cnv;
    }

    @Override
    public void depositar(Double monto) {
        super.depositar(monto - monto * 0.01);
    }

    @Override
    protected Boolean puedeRetirar(Double monto) {
        return monto <= getSaldo() * 0.5;
    }


    @Override
    protected Boolean puedeRetirar(Double monto, String cnv) {
        return monto <= getSaldo() && this.cnv.equals(cnv);
    }

    public void retirar(Double monto, String cnv) {
        if (puedeRetirar(monto, cnv)){
            super.retirar(monto);
        }else {
            System.out.println("Contraseña incorrecta");
        }
    }
}
