import java.util.List;

public class Main {

    public static void main(String[] args) {


        Recorrido recorrido = null;
        try {
            recorrido = new Recorrido("Bueno Aires", "Alberti");
        } catch (RecorridoException e) {
            e.printStackTrace();
        }
        Recorrido recorrido1 = null;
        try {
            recorrido1 = new Recorrido("Lujan", "Bragado");
        } catch (RecorridoException e) {
            e.printStackTrace();
        }
        Recorrido recorrido2 = null;
        try {
            recorrido2 = new Recorrido("Mercedes", "Chivilcoy");
        } catch (RecorridoException e) {
            e.printStackTrace();
        }


        Reserva reserva = new Reserva(1,recorrido,5);
        Reserva reserva1 = new Reserva(2,recorrido,15);
        Reserva reserva2 = new Reserva(3,recorrido2,8);
        Reserva reserva3 = new Reserva(4,recorrido,2);
        Reserva reserva4 = new Reserva(5,recorrido1,4);
        Reserva reserva5 = new Reserva(6,recorrido1,1);
        Reserva reserva6 = new Reserva(7,recorrido,2);
        Reserva reserva7= new Reserva(8,recorrido2,3);

        Empresa empresa = new Empresa();

        empresa.agregarReserva(reserva);
        empresa.agregarReserva(reserva1);
        empresa.agregarReserva(reserva2);
        empresa.agregarReserva(reserva3);
        empresa.agregarReserva(reserva4);
        empresa.agregarReserva(reserva5);
        empresa.agregarReserva(reserva6);
        empresa.agregarReserva(reserva7);

        System.out.println(empresa.cantVecesRecorridaTotal("Alberti"));
        System.out.println(empresa.cantVecesRecorridaTotal("Bragado"));
        System.out.println(empresa.cantVecesRecorridaTotal("Chivilcoy"));

    }
}