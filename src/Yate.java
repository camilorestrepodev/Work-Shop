import java.util.Date;

public class Yate extends Embarcacion{
    private int cantidadCamarotes;

    public Yate(Capitan capitan, int valorBase, int yearFabricacion, int eslora, int cantidadCamarotes) {
        super(capitan, valorBase, yearFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public int comprasYates(int camarotes){
        if(camarotes > 7){
            System.out.println("Usted se lleva un yate con camarotes de lujo");
        }else{
            System.out.println("Este yate no lleva camarotes de lujo");
        }
        return camarotes;
    }
}
