package volum2;

public class Ejercici27 {

	public static void main(String[] args) {
		for (char c = 'a'; c <= 'z'; c++) {
			if (c == 'a') {
				System.out.println(c + " és vocal");
			} else if (c == 'e') {
				System.out.println(c + " és vocal");
			} else if (c == 'i') {
				System.out.println(c + " és vocal");
			} else if (c == 'o') {
				System.out.println(c + " és vocal");
			} else if (c == 'u') {
				System.out.println(c + " és vocal");
			} else {
				System.out.println(c + " és consonant");
			}
		}
		System.out.println("------------------------------");
		for (char c = 'a'; c <= 'z'; c++) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				System.out.println(c + " és vocal");
			} else {
				System.out.println(c + " és consonant");
			}
		}
		System.out.println("------------------------------");
		for (char c = 'a'; c <= 'z'; c++) {
			switch (c) {
			case 'a': {
				System.out.println(c + " és vocal");
				break;
			}
			case 'e': {
				System.out.println(c + " és vocal");
				break;
			}
			case 'i': {
				System.out.println(c + " és vocal");
				break;
			}
			case 'o': {
				System.out.println(c + " és vocal");
				break;
			}
			case 'u': {
				System.out.println(c + " és vocal");
				break;
			}
			default:
				System.out.println(c + " és consonant");
			}
		}
		
	}

}
