
public class LicenciaConducirAuto extends LicenciaConducir{

    private String leyenda;

    public LicenciaConducirAuto(Persona persona, String fechaVigencia, String fechaCaducidad, Boolean principiante, String leyenda) {
        super(persona, fechaVigencia, fechaCaducidad, principiante);
        this.leyenda = leyenda;
    }
}
