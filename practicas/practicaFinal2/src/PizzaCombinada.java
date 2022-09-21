import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza{

    private List<Pizza> pizzas;

    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza x){
        pizzas.add(x);
    }

    @Override
    public Double calcularPrecio() {
        double precio = 0.0;

        for (Pizza pizza : pizzas) {
            precio += pizza.calcularPrecio();
        }

        return precio / pizzas.size();
    }
}
