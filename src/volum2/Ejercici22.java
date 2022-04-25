package volum2;

import java.util.Scanner;

public class Ejercici22 {


    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int factorial =1;
    	 for (int index = 2; index <= n; index++) {
             factorial=factorial*index;
         }
        System.out.println("El factorial és: "+factorial);

    }
}