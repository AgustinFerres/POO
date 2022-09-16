public class Reserva {

    private Integer codigo;
    private Recorrido recorrido;
    private Integer cantPersonas;

    private Double valorBoleto;

    public Reserva(Integer codigo, Recorrido recorrido, Integer cantPersonas) {
        this.codigo = codigo;
        this.recorrido = recorrido;
        this.cantPersonas = cantPersonas;
        valorBoleto = 50.0;
    }


    public Double recaudacionTotal(){
        if (recorrido.esDeCabecera()){
            return (cantPersonas * valorBoleto) - (cantPersonas * valorBoleto) * 0.2;
        }
        return cantPersonas * valorBoleto;
    }

    public Integer cantVecesRecorrida(String estacion){
        if (recorrido.getEstacionDestino().equals(estacion) ||
                recorrido.getEstacionPartida().equals(estacion)){
            return cantPersonas;
        }
        return 0;
    }
}
