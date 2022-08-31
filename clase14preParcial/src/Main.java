public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Embarcacion barco = new EmbarcacionYate(new Capitan("Agustin", "Ferres", "MA3D1"), 30000.0, 5000.0, 2019, 103.5, 8);

        EmbarcacionYate otroYate = new EmbarcacionYate(new Capitan("Rodri", "Benitez", "MA3D1"), 30000.0, 5000.0, 2019, 103.5, 5);

        System.out.println(barco.calcularMontoAlquiler());

        EmbarcacionYate yate = (EmbarcacionYate) barco;

        System.out.println(yate.compareTo(otroYate));
    }

}