public class Main {


    public static void main(String[] args) {

        Cuenta cuenta = new CuentaComitente(new Cliente(1,"Agustin"),1000.0,"1234");

     //   cuenta = new CuentaCorriente(new Cliente(1,"Agustin"),1000.0,500.0);

        CuentaComitente cuentaComitente = (CuentaComitente) cuenta;

        cuentaComitente.retirar(600.0, "1234");

        cuentaComitente.informarSaldo();
    }
}