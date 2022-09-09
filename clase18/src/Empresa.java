import java.util.ArrayList;
import java.util.List;

public class Empresa {
    
    private List<Reserva> reservas;

    public Empresa() {
        this.reservas = new ArrayList<>();
    }
    
    
    public void agregarReserva(Reserva reserva){
        reservas.add(reserva);
    }
    
    
    public Integer cantVecesRecorridaTotal(String estacion){
        int cantPersonas = 0;
        
        for (Reserva reserva: reservas) {
            cantPersonas += reserva.cantVecesRecorrida(estacion);
        }
        
        return cantPersonas;
    }

    public Double totalRecaudado(){
        double total = 0;

        for (Reserva reserva: reservas) {
            total += reserva.recaudacionTotal();
        }

        return total;
    }
}
