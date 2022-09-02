public abstract class LicenciaConducir {

    private Persona persona;
    private String fechaVigencia;
    private String fechaCaducidad;
    private Boolean principiante;

    public LicenciaConducir(Persona persona, String fechaVigencia, String fechaCaducidad, Boolean principiante) {
        this.persona = persona;
        this.fechaVigencia = fechaVigencia;
        this.fechaCaducidad = fechaCaducidad;
        this.principiante = principiante;
    }

    public Boolean puedeConducirAutopista(){

        return !principiante;
    }
}
