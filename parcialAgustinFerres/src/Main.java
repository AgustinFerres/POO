public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Agustin", "Ferres", 53154311,"04/04/2003");

        LicenciaConducir licencia = new LicenciaConducirMoto(persona,  "12/11/2013", "12/11/2022", true, 2000);


        LicenciaConducir otralicencia = new LicenciaConducirMoto(persona,  "12/11/2013", "12/11/2022", false, 2000);


        System.out.println(licencia.puedeConducirAutopista());
        System.out.println(otralicencia.puedeConducirAutopista());


        LicenciaConducirMoto licenciaConducirMoto = (LicenciaConducirMoto) licencia;
        LicenciaConducirMoto otralicenciaConducirMoto = (LicenciaConducirMoto) otralicencia;

        System.out.println(licenciaConducirMoto.compareTo(otralicenciaConducirMoto));

    }
}