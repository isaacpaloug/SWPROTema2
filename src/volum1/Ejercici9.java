package volum1;

public class Ejercici9 {
	/*
	 *  @Author Isaac
	 *  Donats tres sencers mostra el valor màxim i el mínim.
	 */
	public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int c = 11;
       
        System.out.println("a=" + a + " b=" + b + " c=" + c);
        int maxim = a; 
        int minim = a;
         
        if (b > maxim) {
            maxim = b;
        }
        if (c > maxim) {
            maxim = c;
        }
        if (b < minim) {
            minim = b;
        }
        if (c < minim) {
            minim = c;
        }
        
        System.out.println("Màxim=" + maxim);
        System.out.println("Mínim=" + minim);
    }
}
