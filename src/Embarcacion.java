public class Embarcacion{
    private Capitan capitan;
    private int valorBase;
    private int yearFabricacion;
    private int eslora;

    public Embarcacion(Capitan capitan, int valorBase, int yearFabricacion, int eslora) {
        this.capitan = capitan;
        this.valorBase = valorBase;
        this.yearFabricacion = yearFabricacion;
        this.eslora = eslora;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public int getYearFabricacion() {
        return yearFabricacion;
    }

    public int getEslora() {
        return eslora;
    }

    public int calcularMontoAlquiler(){
        if (yearFabricacion > 2020){
            return valorBase + 20000;
        }else{
            return valorBase;
        }
    }
}
