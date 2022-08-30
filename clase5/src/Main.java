public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("AF3R", "1234");


        System.out.println(usuario.getNivel());
        usuario.subirNivel();
        System.out.println(usuario.getNivel());

        System.out.println(usuario.getPuntaje());
        usuario.aumentarPuntaje();
        System.out.println(usuario.getPuntaje());

        System.out.println(usuario.getPuntaje());
        usuario.bonus(3);
        System.out.println(usuario.getPuntaje());
    }
}