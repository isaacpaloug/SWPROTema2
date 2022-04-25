package volum2;

public class Ejercici25 {

	public static void main(String[] args) {
        if (args.length == 1) {
            //El transformam a int
            int num = Integer.parseInt(args[0]);

            int i = 2;
            //En trobar un divisor acaba. Acabarà per que com a mínim quan 
            //i==num la condició no serà certa.
            while (num % i != 0) {
                i++;
            }
            if (i == num) {
                System.out.println("És primer");
            } else {
                System.out.println("No és primer");
            }
        } else {
            System.err.println("Ha de posar un únic argument");
        }
	}
}
