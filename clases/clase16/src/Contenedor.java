public class Contenedor
        implements Comparable<Contenedor>{

    private Integer id;
    private String pais;
    private Boolean materialesPeligrosos;


    public Contenedor(Integer id, String pais, Boolean materialesPeligrosos) {
        this.id = id;
        this.pais = pais;
        this.materialesPeligrosos = materialesPeligrosos;
    }

    @Override
    public int compareTo(Contenedor otroContenedor) {
        return this.id.compareTo(otroContenedor.id);
    }

    @Override
    public String toString() {
        return "id: " + id + " procedencia: " + pais;
    }

    public Boolean getMaterialesPeligrosos() {
        return materialesPeligrosos;
    }

    public String getPais() {
        return pais;
    }
}
