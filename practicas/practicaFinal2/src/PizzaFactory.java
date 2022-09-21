public class PizzaFactory {

    public static final String MUZZA_CHICA = "muzza chica";
    public static final String MUZZA_GRANDE = "muzza grande";
    public static final String ESPECIAL_CHICA = "especial chica";
    public static final String ESPECIAL_GRANDE = "especial grande";
    public static final String ANANA_CHICA = "anana chica";
    public static final String ANANA_GRANDE = "anana grande";
    public static final String LOCA_CHICA = "loca chica";
    public static final String LOCA_GRANDE = "loca grande";
    private static PizzaFactory instance;

    private PizzaFactory() {
    }

    public static PizzaFactory getInstance() {
        if (instance == null){
            instance = new PizzaFactory();
        }
        return instance;
    }

    public Pizza crearPizza(String codigo) throws PizzaFactoryException{
        if (codigo == null){
            throw new PizzaFactoryException(codigo + " no puede ser nulo");
        }
        switch (codigo){
            case MUZZA_CHICA:
                return new PizzaSimple("Muzzarella", "la mejor pizza", 700.0, false);
            case MUZZA_GRANDE:
                return new PizzaSimple("Muzzarella", "la mejor pizza", 700.0, true);
            case ESPECIAL_CHICA:
                return new PizzaSimple("Especial", "ni idea", 850.0, false);
            case ESPECIAL_GRANDE:
                return new PizzaSimple("Especial", "ni idea", 850.0, true);
            case ANANA_CHICA:
                return new PizzaSimple("Anana", "un asco", 950.0, false);
            case ANANA_GRANDE:
                return new PizzaSimple("Anana", "un asco", 950.0, true);
            case LOCA_CHICA:
                PizzaCombinada loca = new PizzaCombinada("loca", "una aberracion");

                loca.addPizza(crearPizza(ESPECIAL_CHICA));
                loca.addPizza(crearPizza(ANANA_CHICA));

                return loca;
            case LOCA_GRANDE:
                PizzaCombinada LOCA = new PizzaCombinada("loca", "una aberracion");

                LOCA.addPizza(crearPizza(ESPECIAL_GRANDE));
                LOCA.addPizza(crearPizza(ANANA_GRANDE));

                return LOCA;
            default:
                throw new PizzaFactoryException(codigo + " no es un codigo valido");
        }
    }
}
