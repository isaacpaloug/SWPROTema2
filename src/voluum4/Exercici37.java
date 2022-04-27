package voluum4;

public class Exercici37 {
	public static void main(String[] args) {
		int[][] matriu = new int[4][4];
		
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = i + j;
                System.out.print(matriu[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Principal");
        for (int i = 0; i < matriu.length; i++) {
            System.out.print(matriu[i][i] + "\t");
        }
        System.out.println();

        System.out.println("Secundaria");
        for (int i = 0, j=matriu.length-1; i < matriu.length; i++, j--) {
            System.out.print(matriu[i][j] + "\t");
        }
        System.out.println();
	}
}
