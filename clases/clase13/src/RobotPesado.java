public class RobotPesado extends SistemaArmas
    implements Atacar, Defender, Volar{

    public RobotPesado(Double energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        super.restarEnergia(20.0);
    }

    @Override
    public void defender() {
        super.restarEnergia(10.0);
    }

    @Override
    public void volar() {
        super.restarEnergia(5.0);
    }
}
