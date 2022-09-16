public class Main {
    public static void main(String[] args) throws ClienteException {

        Cliente cliente = new Cliente("Pablo", "Velez", "30021233", 1000.0);

        cliente.comprar(900.0);

        cliente.saldarDeuda(1000.0);



    }
}