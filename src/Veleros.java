import java.util.Date;

public class Veleros extends Embarcacion{
   private int cantidadMastiles;

    public Veleros(Capitan capitan, int valorBase, int yearFabricacion, int eslora, int cantidadMastiles) {
        super(capitan, valorBase, yearFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public int getCantidadMastiles() {
        return cantidadMastiles;
    }

    public int tamanoVelos(int velos) {
        if (velos > 4) {
            System.out.println("Este es un velero grande");
        } else {
            System.out.println("Este es un velero pequeño");
        }
        return velos;
    }
}
