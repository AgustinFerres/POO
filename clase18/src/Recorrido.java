import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recorrido {

    private String estacionPartida;
    private String estacionDestino;

    private static List<String> estaciones = Arrays.asList("buenos aires", "lujan", "mercedes", "suipacha", "chivilcoy", "alberti", "bragado");

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
        return estaciones;
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
