package volum1;

public class Ejercici13 {

	public static void main(String[] args) {
        int a = 0;
        int b = 3;
        int c = 2;
        int aux;
        if (a > b) {
            aux=a;
            a=b;
            b=aux;
        }
        if (a > c) {
            aux=a;
            a=c;
            c=aux;
        }
        //Ordenam els altres dos valors
        if (b > c) {
            aux=b;
            b=c;
            c=aux;
        }
        System.out.println("a=" + a + " b=" + b + " c=" + c);	
		
		

	}

}
