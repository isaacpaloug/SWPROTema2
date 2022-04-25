package voluum4;

public class Ejercici35 {

	public static void main(String[] args) {
		boolean iguals = true;
		int random1 =  (int)(10 + Math.random()* 21);
		int random2 =  (int)(10 + Math.random()* 21);
		System.out.println("numero random 1: " + random1);
		System.out.println("numero random 2: " + random2);
		
		// GENERAM LES LLISTES AMB LLARGARIA RANDOM
		int[] llista1 = new int[random1];
		int[] llista2 = new int[random2];
		// LES OMPLIM SEQÜENCIALMENT
		for (int i = 0; i < llista1.length; i++) {
			llista1[i] = i + 1;
		}
		for (int i = 0; i < llista2.length; i++) {
			llista2[i] = i + 1;
		}
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
