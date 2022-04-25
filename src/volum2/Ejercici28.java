package volum2;

public class Ejercici28 {

	public static void main(String[] args) {
		for (char c = 'a'; c <= 'z'; c++) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':{
				System.out.println(c + " és vocal");
				break;
			}
			default:
				System.out.println(c + " és consonant");
			}
		}

	}

}
