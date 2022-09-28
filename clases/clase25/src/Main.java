public class Main {
    public static void main(String[] args) {


        Subasta s = new Subasta(2000.0, " entradas a  la final del uruguayo");

        s.agregarOferente(new Oferente("Gonza", "Alvarez", "123", 3000.0));
        s.agregarOferente(new Oferente("Dami", "Dell'Acqua", "123", 1000.0));
        s.agregarOferente(new Oferente("Flor", "Lecha", "123", 3050.0));
        s.agregarOferente(new Oferente("Rodri", "Brause", "123", 3000.0));
        s.agregarOferente(new Oferente("Rodri", "Benitez", "123", 4000.0));
        s.agregarOferente(new Oferente("Gas", "inamorato", "123", 2000.0));

        s.notificar();
    }
}