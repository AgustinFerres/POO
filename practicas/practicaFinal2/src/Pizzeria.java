import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

    private List<Pizza> pizzas;
    private String nombre;

    public Pizzeria(String nombre) {
        this.nombre = nombre;
        pizzas = new ArrayList<>();
    }

    public void agregarPizza(String codigo){
        try {
            pizzas.add(PizzaFactory.getInstance().crearPizza(codigo));
        } catch (PizzaFactoryException e) {
            e.printStackTrace();
        }
    }

    public void mostrarPizzas(){
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
    }
}
