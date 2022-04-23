package cat.paucasesnoves.isaac;

public class Ejercici5 {

	public static void main(String[] args) {
		int horesTreballades = 45;
		double preuHora = 10;
		int horesExtra = 0;
		int horesNormals;
		if (horesTreballades > 40) {
			horesExtra = horesTreballades - 40;
			horesNormals = 40;
		}
		else {
			horesNormals = horesTreballades;
		}
		double sou = horesNormals * preuHora + horesExtra * preuHora * 2;
		
		System.out.println("sou: " + sou);
	}

}
