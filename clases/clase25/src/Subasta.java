import java.util.ArrayList;
import java.util.List;

public class Subasta implements Observable{

    private Double monto;
    private String descripcion;

    private  List<Observer> oferentes;

    public Subasta(Double monto, String descripcion) {
        this.monto = monto;
        this.descripcion = descripcion;
        oferentes = new ArrayList<>();
    }

    public void agregarOferente(Observer observer){
        oferentes.add(observer);
    }
    public void quitarOferente(Observer observer){
        oferentes.remove(observer);
    }

    @Override
    public void notificar() {
        for (Observer oferente : oferentes) {
            oferente.actualizar(this);
        }
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getMonto() {
        return monto;
    }
}
