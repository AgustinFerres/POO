public class LicenciaConducirMoto extends  LicenciaConducir
    implements Comparable{

    private Integer maximoCilindradas;


    public LicenciaConducirMoto(Persona persona, String fechaVigencia, String fechaCaducidad, Boolean principiante, Integer maximoCilindradas) {
        super(persona, fechaVigencia, fechaCaducidad, principiante);
        this.maximoCilindradas = maximoCilindradas;
    }

    @Override
    public int compareTo(Object o) {

        LicenciaConducirMoto otraLicencia = (LicenciaConducirMoto) o;

        return this.maximoCilindradas - otraLicencia.maximoCilindradas;
    }
}
