package volum2;


public class Ejercici24 {

	public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        boolean primer = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primer = false;
                break;
            }
        }
        if (primer) {
            System.out.println("Es primer");
        } else {
            System.out.println("No és primer");
        }
	}

}
