import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cantidad");
        Integer n = scanner.nextInt();
        int acumulador = 0;

        for (int i = 2; i <= (n * n); i++) {
            if (esPrimo(i) && acumulador < n) {
                System.out.println(i);
                acumulador++;
            }
        }
    }

    public static boolean esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }
}
