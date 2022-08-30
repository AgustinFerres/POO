import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int sum = calculadora.sumar(2, 2);
        int rest = calculadora.restar(2, 2);
        int multi = calculadora.multiplicar(2, 2);
        int div = calculadora.dividr(2, 2);

        System.out.println(sum);
        System.out.println(rest);
        System.out.println(multi);
        System.out.println(div);


    }
        Scanner scanner = new Scanner(System.in);

// ejercicio 1

        Integer numero = scanner.nextInt();

        Boolean primo = esPrimo(numero);

        System.out.println(primo);
// ejercicio 2


        Integer numeroA = scanner.nextInt();
        Integer numeroB = scanner.nextInt();
        Integer numeroC = scanner.nextInt();

        Integer maximo = maximoEntreTresNumeros(numeroA, numeroB, numeroC);

        System.out.println(maximo);


// vacio
        scanner.nextLine();


        // ejercicio 3

        String textoA = scanner.nextLine();
        String textoB = scanner.nextLine();

        System.out.println(!textoA.equals(textoB));
    }

    // ejercicio 1
    public static Boolean esPrimo(Integer num1) {

        for (int i = 2; i <= (num1 / 2); i++) {

            if (num1 % i == 0) {
                return false;
            }
        }
        return true;
    }
    //ejercicio 2

    public static Integer maximoEntreTresNumeros(Integer num1, Integer num2, Integer num3) {

        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }public static class Calculadora {

        public int  sumar(int a, int b) {
            //completa esta funcion
            return a + b;
        }
        public int  restar(int a, int b) {
            return a - b;
        }
        public int  multiplicar(int a, int b) {
            return a * b;
        }
        public int  dividr(int a, int b) {
            return a / b;
        }
    }
}





























