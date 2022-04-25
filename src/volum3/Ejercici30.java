package volum3;

import java.util.Scanner;

public class Ejercici30 {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		System.out.println("Introdueix un any");
		int any = teclat.nextInt();
		System.out.println("Introdueix un mes de l' any 1-12");
		int mes = teclat.nextInt();
		int dies;
		if (mes < 1 || mes > 12) {
			System.out.println("El numero introduit no pertany a cap mes de l'any");
		} else {
	        switch (mes) {
            case 2: {
                if ((any % 4 == 0 && any % 100 != 0) || any % 400 == 0) {
                    dies = 29;
                } else {
                    dies = 28;
                }
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
