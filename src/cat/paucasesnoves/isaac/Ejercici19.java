package cat.paucasesnoves.isaac;

public class Ejercici19 {

	public static void main(String[] args) {
        //Imprimeix tots els n�meros excepte el 5
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);

        }
        //Imprimeix els 4 primers numeros
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);

        }
        System.out.println("El continue es bota el 5, per� segueix "
        		+ "el break surt de la iteraci�, "
        		+ "el darrer n�mero que mostra �s el quatre");

	}

}
