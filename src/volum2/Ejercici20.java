package volum2;

public class Ejercici20 {

	public static void main(String[] args) {
        if (args.length == 1) {
            int n = Integer.parseInt(args[0]);
            for (int i = 1; i <= 10; i++) {
                
                System.out.println(n + " * " + i + " = " + (n * i));
            }
        } else {
            System.out.println("No ha passat el nombre correcte d'arguments");
        }

	}

}
