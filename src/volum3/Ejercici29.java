package volum3;

import java.util.Scanner;

public class Ejercici29 {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		System.out.println("Introdueix un mes de l' any 1-12");
		int numero = teclat.nextInt();
		int dies;
		if (numero < 1 || numero > 12) {
			System.out.println("El numero introduit no pertany a cap mes de l'any");
		} else {
	        switch (numero) {
            case 2: {
                dies = 28;
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                dies = 30;
                break;
            }
            default: {
                dies = 31;
                break;
            }
        }
        System.out.println("El mes introduit té: " + dies + " dies");
		}
	}

}
