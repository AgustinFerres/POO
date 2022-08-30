public class Main {
    public static void main(String[] args) {

        SistemaArmas x = new RobotPesado(100.0);

        RobotPesado y = (RobotPesado) x;

        y.atacar();
        y.defender();
        y.volar();
        y.mostrar();

        System.out.println(y.getEnergia());
    }
}