package volum2;

import java.util.Scanner;

public class Ejercici26 {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
        int num = 0;
        int comptador = 0;
        int suma = 0;
        double mitjana;

        do {
            num = teclat.nextInt();
            comptador++;
            suma = suma + num;
        } while (num != 0);
        comptador --;
        mitjana = (double) suma / (double) comptador;
        System.out.println("Mitjana=" + mitjana);
	}

}
