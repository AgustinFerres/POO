import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         // console.log
        System.out.println("Hola mundo");

        // variables

        String nombre = "Martina";

        Integer edad = 25;

        Double altura = 1.72;

        // operaciones

        System.out.println("mi nombre es " + nombre + " y mi altura es de " + altura + " metros");

        //condicionales

        if(altura > 1.40){
            System.out.println("puede subir");
        }else{
            System.out.println("no puede subir");
        }
        // scanner

        Scanner scanner = new Scanner(System.in);
    }
}
