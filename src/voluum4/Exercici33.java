package voluum4;

public class Exercici33 {

	public static void main(String[] args) {
		int[] vector = new int[10];
        for (int index = 0; index < vector.length; index++) {
        	
            vector[index] = 100 + (int)(Math.random() * 101);
            System.out.println(vector[index]);
        }

	}

}
