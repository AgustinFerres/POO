public class Main {
    public static void main(String[] args) {


        Paciente gonza = new Paciente("Gonza", new AstraZencaStrategy("Oxford-AstraZeneca ", "Inglaterra ", 1, " Fiebre luego de ser aplicada "));
        Paciente javi = new Paciente("Javi", new ModernaStrategy("Moderna ", "EEUU ", 2, " Tomar una ibupirac para el dolor de cabeza"));
        Paciente buati = new Paciente("Bauti", new SobernaStrategy("Moderna ", "EEUU ", 3, " NO TIENE"));


        gonza.vacunarse();
        gonza.vacunarse();

        javi.vacunarse();
        javi.vacunarse();
        javi.vacunarse();

        buati.vacunarse();
        buati.vacunarse();
        buati.vacunarse();
        buati.vacunarse();
    }
}