public class Paciente {

    private String nombre;
    private Integer cantidadVacunas;
    private VacunaStrategy strategy;

    public Paciente(String nombre, VacunaStrategy strategy) {
        this.nombre = nombre;
        this.cantidadVacunas = 0;
        this.strategy = strategy;
    }

    public void vacunarse(){
        if (cantidadVacunas < strategy.getCantidadDosis()){
            cantidadVacunas++;
            int vacunasRestantes = strategy.calcularCantidadDosis(cantidadVacunas);
            if (vacunasRestantes == 0){
                System.out.println(nombre +  " te vacunamos, no te quedan dosis por aplicar. \n Detalles: "+ strategy.getDetalle());
                return;
            }
            System.out.println(nombre + " te vacunamos, te quedan " + vacunasRestantes+ " por aplicar \n Detalles: "+ strategy.getDetalle());

        }else{
            System.out.println(nombre + " ya estas vacunado");
        }


    }
}
