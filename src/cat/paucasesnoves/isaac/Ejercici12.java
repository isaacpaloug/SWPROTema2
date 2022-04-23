package cat.paucasesnoves.isaac;

public class Ejercici12 {

	public static void main(String[] args) {
		int horesTreballades = 45;
		double preuHora = 10;
		int horesExtra = 0;
		int horesNormals;
		double irpf;
		if (horesTreballades > 40) {
			horesExtra = horesTreballades - 40;
			horesNormals = 40;
		}
		else {
			horesNormals = horesTreballades;
		}
		double sou = horesNormals * preuHora + horesExtra * preuHora * 2;
		
        if (sou <= 300) {
            irpf = sou * 0.1;
        } else if (sou <= 500) {
            irpf = sou * 0.2;
        } else {
            irpf = sou * 0.3;
        }
        System.out.println("Sou brut: " + sou);
        System.out.println("irpf: " + irpf);
        System.out.println("Sou net: " + (sou - irpf));

	}

}
