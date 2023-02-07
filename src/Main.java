public class Main {
    public static void main(String[] args) {
        Capitan miCapitan = new Capitan("Jose", "Gomez", 12345);
        Capitan miCapitan2 = new Capitan("Jesus","Perez",78945);
        Veleros miVelero = new Veleros(miCapitan,15000,2021,123,4);
        Yate miYate = new Yate(miCapitan2,30000,2019,202,7);
        System.out.println("El nombre del capitan es: " + miCapitan.getNombre() + " " + miCapitan.getApellido() + " el numero de matricula es: " + miCapitan.getMatriculaNavegacion() );
        System.out.println("El valor es: " + miVelero.calcularMontoAlquiler() + " con un total de mastiles: " + miVelero.getCantidadMastiles());
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("El nombre del capitan es: " + miCapitan2.getNombre() + " " + miCapitan2.getApellido() + " el numero de matricula es: " + miCapitan2.getMatriculaNavegacion() );
        System.out.println("El valor es: " + miYate.calcularMontoAlquiler() + " con un total de camarotes de: " + miYate.getCantidadCamarotes());
    }
}