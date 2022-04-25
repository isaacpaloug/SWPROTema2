package voluum4;

import java.util.Iterator;

public class Exercici34 {

	public static void main(String[] args) {
		boolean iguals = true;
		int[] llista1 = new int[18];
		int[] llista2 = new int[18];
		
		for (int i = 0; i < llista1.length; i++) {
			llista1[i] = i + 1;
			llista2[i] = i + 1;
		}
		
		// Comparacio amb igualtat '=='
		
		if (llista1 == llista2) {
			System.out.println("son iguals");
		} else {
			System.out.println("no son iguals");
		}
		// Comparacio ben feta
		if (llista1.length == llista2.length) {
			for (int i = 0; i < llista1.length; i++) {
				if(llista1[i] != llista2[i]) {
					iguals = false;
				} else {
					iguals = true;
				}
			}
		} else {
			iguals = false;
		}
		if (iguals) {
			System.out.println("son iguals");
		} else {
			System.out.println("no son iguals");
		}
	}	

}
