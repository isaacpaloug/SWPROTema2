package voluum4;

public class Exercici36 {

	public static void main(String[] args) {
		
		// Generam numero random del 1 al 3
		int randomNum = (int)(1 + Math.random() * 3);
		int[] llista = new int[randomNum];
		
		for (int i = 0; i < llista.length; i++) {
			llista[i] = 1 + (int) (Math.random() * 51);
		}
		
		if (llista.length != 3) {
			System.out.println("La longitud de l'array és de " + randomNum + 
					" i nomes es pot ordenar si en te 3");
		} else {
			//Mostrar-lo desordenat
			System.out.println("Vector desordenat: " + '\n');
            for (int index = 0; index < llista.length; index++) {
                System.out.print(llista[index] + "\t");
            }
            
            //Mostrar-lo ordenat
            System.out.println("");
            System.out.println("Vector ordenat:");
            int a = llista[0];
            int b = llista[1];
            int c = llista[2];
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
            System.out.println( a + "\t" +  b + "\t" + c);
		}
	}
}
