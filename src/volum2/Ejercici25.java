package volum2;

public class Ejercici25 {

	public static void main(String[] args) {
        if (args.length == 1) {
            //El transformam a int
            int num = Integer.parseInt(args[0]);

            int i = 2;
            //En trobar un divisor acaba. Acabar� per que com a m�nim quan 
            //i==num la condici� no ser� certa.
            while (num % i != 0) {
                i++;
            }
            if (i == num) {
                System.out.println("�s primer");
            } else {
                System.out.println("No �s primer");
            }
        } else {
            System.err.println("Ha de posar un �nic argument");
        }
	}
}
