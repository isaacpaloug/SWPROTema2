package cat.paucasesnoves.isaac;

public class Ejercici10 {

	public static void main(String[] args) {
		double nota = 9;
		String qualificacio = "";
		if (nota <= 4.9) {
			qualificacio = "insuficient";
		}
		if ((nota >= 5) && (nota < 7)) {
			qualificacio = "suficient";
		}
		if ((nota >= 7) && (nota < 9)) {
			qualificacio = "notable";
		}
		else if (nota >= 9) {
			qualificacio = "Excelent";
		}
		System.out.println("La qualificacio és: " + qualificacio);
	}

}
