public class EmbarcacionYate extends Embarcacion
    implements Comparable{

    private Integer cantidadCamarotes;

    public EmbarcacionYate(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Integer cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public int compareTo(Object o) {

        EmbarcacionYate otroYate = (EmbarcacionYate) o;

        return this.cantidadCamarotes - otroYate.cantidadCamarotes;
    }
}
