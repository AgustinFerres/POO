public class Main {
    public static void main(String[] args) {


        Puerto puerto = new Puerto();

        puerto.addContenedores(new Contenedor(7, "EEUU", true));
        puerto.addContenedores(new Contenedor(2, "Desconocida", true));
        puerto.addContenedores(new Contenedor(3, "Rusia", false));
        puerto.addContenedores(new Contenedor(10, "Brasil", true));
        puerto.addContenedores(new Contenedor(5, "Canada", false));
        puerto.addContenedores(new Contenedor(6, "Desconocida", true));


        System.out.println(puerto.cantidadPeligrosos());

        puerto.showContenedores();
    }



}