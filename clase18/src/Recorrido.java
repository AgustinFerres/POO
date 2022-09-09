import java.util.ArrayList;
import java.util.List;

public class Recorrido {

    private String estacionPartida;
    private String estacionDestino;

    public Recorrido(String estacionPartida, String estacionDestino) throws RecorridoException {
        if (!getEstacionesPosibles().contains(estacionPartida.toLowerCase()) ||
                !getEstacionesPosibles().contains(estacionDestino.toLowerCase()))
        {
            throw new RecorridoException(estacionPartida + " o " + estacionDestino + "no son estaciones validas");
        }

        this.estacionPartida = estacionPartida;
        this.estacionDestino = estacionDestino;

    }

    public List<String> getEstacionesPosibles(){

        List<String> estacionesPosibles = new ArrayList<>();

        estacionesPosibles.add("buenos aires");
        estacionesPosibles.add("lujan");
        estacionesPosibles.add("mercedes");
        estacionesPosibles.add("suipacha");
        estacionesPosibles.add("chivilcoy");
        estacionesPosibles.add("alberti");
        estacionesPosibles.add("bragado");

        return estacionesPosibles;
    }


    public Boolean esDeCabecera(){
        return estacionPartida.equals(getEstacionesPosibles().get(0)) &&
                 estacionDestino.equals(getEstacionesPosibles().get(getEstacionesPosibles().size() - 1));
    }


    public String getEstacionPartida() {
        return estacionPartida;
    }

    public String getEstacionDestino() {
        return estacionDestino;
    }
}
