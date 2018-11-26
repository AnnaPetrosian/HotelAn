import java.util.Scanner;

public class Applicatie {
	
	public static void main(String[] args) {
		
		
		Hotel h = new Hotel();
		
		Scanner scanner= new Scanner(System.in);
	
		while (!h.alleKamersBezet()) 
		{
			System.out.println("Goede dag: welcom Hotel Fawlty Towers");
			System.out.println("Wilt u bij ons gaan reserveren?");
			System.out.println("Toets 'ja' als u wil bij ons gaan reserveren of 'nee' om te stoppen");
			String invoer = scanner.next();
			if(invoer.equals("ja")){
				System.out.println("Toets u naam alstublieft");
				String newNaam = scanner.next();
				System.out.println("Met hoeveel personen wilt u gaan reserveren?");
				int aantalPersonen = scanner.nextInt();
				if (!h.isBezet(aantalPersonen)){
					System.out.println("Vul aantal dagen in: ");
					// vul aantal dagen in
					int aantalDagen = scanner.nextInt();
					//Persoon p = new Persoon(newNaam);
					Reservering r = new Reservering(new Persoon(newNaam),aantalPersonen,aantalDagen);
					h.setKamer(aantalPersonen, r);
					System.out.println("reservatie geslaagd");
				} 
				
					else {System.out.println("Kamers van "+aantalPersonen+" zijn vol");}	
			}
			else if (invoer.equals("nee")) {
				System.out.println("U heeft de reservatie gestopt!");
				break; 
			} else {
				System.out.println("Geen toegang");
				
			}
		}
	System.out.println("Kamers Overzicht: ");
	h.printKamers();		
}

}
