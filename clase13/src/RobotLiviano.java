public class RobotLiviano extends  SistemaArmas
    implements Atacar, Defender, Volar{

    public RobotLiviano(Double energia) {
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
        super.restarEnergia(1.0);
    }
}
