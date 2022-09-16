public class Main {
    public static void main(String[] args) {
        Empleado employee = new Empleado("Agustin", 19, "Manager", 3.5);
        employee.showAttributes();
        System.out.println(employee.manipularMaquinaria());
    }
}