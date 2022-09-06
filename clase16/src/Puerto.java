import java.util.ArrayList;
import java.util.List;

public class Puerto {

    private List<Contenedor> contenedores;

    public Puerto(){
        contenedores = new ArrayList<>();
    }

    public void addContenedores(Contenedor contenedor){
        contenedores.add(contenedor);
        contenedores.sort(null);
    }

    public void showContenedores(){
        for (Contenedor contenedor: contenedores) {
            System.out.println(contenedor);
        }
    }

    public Integer cantidadPeligrosos(){
        int contador = 0;

        for (Contenedor contenedor : contenedores) {
            if (contenedor.getMaterialesPeligrosos() && contenedor.getPais().equalsIgnoreCase("desconocida")){
                contador++;
            }
        }
        return contador;
    }
}
