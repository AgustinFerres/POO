public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "Ferres", "5.310.543", 1);


        Cuenta cuenta = new CajaAhorro(cliente, 10000.0, 0.05);

        cuenta.extraer(500.0);

        System.out.println(cuenta.informarSaldo());

        cuenta.depositar(50.0);

        System.out.println(cuenta.informarSaldo());

        cuenta.extraer(10000.0);

        System.out.println(cuenta.informarSaldo());


        Cuenta otraCuenta = new CuentaCorriente(cliente, 100.0, 500.0);

        otraCuenta.extraer(50.0);

        System.out.println(otraCuenta.informarSaldo());

        otraCuenta.depositar(5.0);

        System.out.println(otraCuenta.informarSaldo());

        otraCuenta.extraer(60.0);


        System.out.println(otraCuenta.informarSaldo());

        otraCuenta.extraer(600.0);

        System.out.println(otraCuenta.informarSaldo());

    }
}