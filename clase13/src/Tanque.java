public class Tanque extends SistemaArmas
    implements Atacar, Defender {

    public Tanque(Double energia) {
        super(energia);
    }


    @Override
    public void atacar() {
        super.restarEnergia(50.0);
    }

    @Override
    public void defender() {
        super.restarEnergia(10.0);
    }

}
