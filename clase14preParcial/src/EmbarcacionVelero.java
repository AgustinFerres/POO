public class EmbarcacionVelero extends Embarcacion{

    private Integer cantidadMastiles;

    public EmbarcacionVelero(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Integer cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public Boolean esGrande (){
        return cantidadMastiles > 4;
    }
}
