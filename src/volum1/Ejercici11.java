package volum1;

public class Ejercici11 {

	public static void main(String[] args) {
		int nota = 11;
		String qualificacio = "";
		
		switch (nota) {
		case 1: qualificacio = "insuficient";
			break;
		case 2: qualificacio = "insuficient";
			break;
		case 3: qualificacio = "insuficient";
			break;
		case 4: qualificacio = "insuficient";
			break;
		case 5: qualificacio = "suficient";
			break;
		case 6: qualificacio = "bé";
			break;
		case 7: qualificacio = "notable";
			break;
		case 8: qualificacio = "notable";
			break;
		case 9: qualificacio = "excelent";
			break;
		case 10: qualificacio = "excelent";
			break;
		default: qualificacio = "incorrecte";
			break;
		}
		System.out.println("La qualificacio introduida és: " + qualificacio);
	}

}
