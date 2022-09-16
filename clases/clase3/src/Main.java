import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // solicitar nombre
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre primer jugador: ");

        String primero = scanner.nextLine();

        System.out.println("Nombre segundo jugador: ");

        String segundo = scanner.nextLine();

        // opcion cada jugador

        // 1 = Piedra
        // 2 = Papel
        // 3 = Tijera
        // 4 = Spock

        System.out.println("Opcion primer jugador: ");

        Integer opcionPrimero = scanner.nextInt();

        System.out.println("Opcion segundo jugador: ");

        Integer opcionSegundo = scanner.nextInt();

        // funcion

        System.out.println("Gano el " + cualGana(opcionPrimero, opcionSegundo) + " jugador");
    }

    public static Integer cualGana (Integer opcion1, Integer opcion2){
        if(opcion1 == opcion2){
            return 0;
        } else if ((opcion1 - opcion2) == 1 || (opcion1 - opcion2) == -2  || (opcion1 - opcion2) == 3) {
            return  1;
        }else {
            return 2;
        }
    }
}