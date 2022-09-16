import java.util.Date;

public class Perro {

    private Boolean enAdopcion;

    private String raza;

    private Integer anioNacimiento;

    private Double peso;

    private Boolean tieneChip;

    private Boolean estaLastimado;

    private String nombreDePila;

    // CONSTRUCTORES


    public Perro(Boolean enAdopcion, String raza, Integer anioNacimiento, Double peso, Boolean tieneChip, Boolean estaLastimado, String nombreDePila) {
        this.enAdopcion = enAdopcion;
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        this.nombreDePila = nombreDePila;
    }

    public Perro(String raza, Integer anioNacimiento, Double peso, String nombreDePila) {
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.nombreDePila = nombreDePila;

        enAdopcion = false;
        tieneChip = false;
        estaLastimado = false;
    }

    // METODOS

    public Integer edad (){
        Date date = new Date();

        return (date.getYear() + 1900) - this.anioNacimiento;
    }

    public String esFactibleAPerderse(){
        if(tieneChip){
            return "No es factible";
        }else {
            return "Se puede perder";
        }
    }

    public void enviarAAdopcion(){
        if (!estaLastimado && peso > 5.0){
            enAdopcion = true;
        }
    }

    // getters y setter


    public Boolean getEnAdopcion() {
        return enAdopcion;
    }

    public Boolean getTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(Boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public Boolean getEstaLastimado() {
        return estaLastimado;
    }

    public void setEstaLastimado(Boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }
}
