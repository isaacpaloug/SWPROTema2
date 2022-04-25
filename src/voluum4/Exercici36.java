package voluum4;

public class Exercici36 {

	public static void main(String[] args) {

        int longitud = 1 + (int) (Math.random() * 4);
        int[] vector = new int[longitud];

        for (int index = 0; index < vector.length; index++) {
            vector[index] = 1 + (int) (Math.random() * 101);
        }

        if (vector.length != 3) {
            System.out.println("La longitud de l'array és " + longitud + " i només puc ordenar-lo si es de tres posicions");
        } else {
            //Mostrar-lo desordenat
            for (int index = 0; index < vector.length; index++) {
                System.out.print(vector[index] + "\t");
            }
            System.out.println("");
            if(vector[0]>vector[1]){
                int aux=vector[0];
                vector[0]=vector[1];
                vector[1]=aux;
            }
            if(vector[0]>vector[2]){
                int aux=vector[0];
                vector[0]=vector[2];
                vector[2]=aux;
            }
            if(vector[1]>vector[2]){
                int aux=vector[2];
                vector[2]=vector[1];
                vector[1]=aux;
            }
            //Mostrar-lo ordenat
            for (int index = 0; index < vector.length; index++) {
                System.out.print(vector[index] + "\t");
            }
            System.out.println("");
        }
	}
}
