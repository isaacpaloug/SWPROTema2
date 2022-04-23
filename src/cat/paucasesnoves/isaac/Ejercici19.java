package cat.paucasesnoves.isaac;

public class Ejercici19 {

	public static void main(String[] args) {
        //Imprimeix tots els números excepte el 5
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
        System.out.println("El continue es bota el 5, però segueix "
        		+ "el break surt de la iteració, "
        		+ "el darrer número que mostra és el quatre");

	}

}
