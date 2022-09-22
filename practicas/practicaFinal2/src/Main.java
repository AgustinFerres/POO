public class Main {
    public static void main(String[] args) {

        Pizzeria pizzeria = new Pizzeria("Pizza Loca");


        pizzeria.agregarPizza("PizzaFactory.MUZZA_CHICA");
        pizzeria.agregarPizza(null);
        pizzeria.agregarPizza(PizzaFactory.ESPECIAL_CHICA);
        pizzeria.agregarPizza(PizzaFactory.LOCA_GRANDE);

        pizzeria.mostrarPizzas();
    }
}