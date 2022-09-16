public class Main {
    public static void main(String[] args) {

        Perro perroAna = new Perro("salchicha mini", 2020, 4.0,"Minerva");

        System.out.println(perroAna.edad());
        System.out.println(perroAna.esFactibleAPerderse());

        System.out.println(perroAna.getEnAdopcion());
        perroAna.enviarAAdopcion();
        System.out.println(perroAna.getEnAdopcion());
    }
}