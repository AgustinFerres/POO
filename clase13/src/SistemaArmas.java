public  class SistemaArmas {
    private Double energia;

    public SistemaArmas(Double energia) {
        this.energia = energia;
    }

    public void mostrar(){
        System.out.println("Hola");
    }

    public void restarEnergia(Double x){
        this.energia -= x;
    }

    public Double getEnergia() {
        return energia;
    }
}
