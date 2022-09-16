public class Usuario {

    private String nombre;
    private String clave;
    private  Integer puntaje;
    private Integer nivel;


    // Constructor

    public Usuario(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        puntaje = 0;
        nivel = 0;
    }

    // Methods

    public  void aumentarPuntaje(){
        puntaje++;
    }
    public  void subirNivel(){
        nivel++;
    }
    public void bonus(Integer valor){
        puntaje += valor;
    }


    // getters & setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
}
