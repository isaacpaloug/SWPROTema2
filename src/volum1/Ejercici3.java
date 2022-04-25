package volum1;

public class Ejercici3 {
	/** Exercici 3

	* Donat un temps expressat en segons, descomposa'l en hores, minuts i segons. 
	* 1 Hora = 3600 segons i 1 minut= 60 segons.
	* Per exemple 3662 ens ha de donar 1 hora, 1 minut i 2 segons.
	* 
	* @author Isaac

	*/
	public static void main(String[] args) {
		int temps = 3662;
		
		int hores = temps / 3600;
		int minuts = (temps % 3600)/60;	
		int segons = (temps%3600)%60;
		System.out.println("hores: " + hores);
		System.out.println("minuts: " + minuts);
		System.out.println("segons: " + segons);
	}

}
