public abstract class Cuenta {

    private Cliente titular;
    private Double saldo;

    public Cuenta(Cliente titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(Double monto){
        saldo += monto;
    }

    public void retirar(Double monto){
        if(puedeRetirar(monto)){
            this.saldo -= monto;
        }
    }

    protected Boolean puedeRetirar(Double monto){
        return saldo >= monto;
    }

    protected  Boolean puedeRetirar(Double monto, String x){
        String y = "";

        return monto <= saldo && y.equals(x);
    }

    public void informarSaldo(){
        System.out.println(titular.getNombre() + " tu saldo actual es de " + saldo);
    }

    public Double getSaldo() {
        return saldo;
    }

}
