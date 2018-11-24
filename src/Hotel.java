import java.util.ArrayList;
import java.util.Scanner;



public class Hotel {
	static ArrayList<Kamer>  kamers = new ArrayList<>();

	public static void main(String[] args) {
		
			kamers.add(new Kamer(4));
			kamers.add(new Kamer(4));
			kamers.add(new Kamer(2));
			kamers.add(new Kamer(2));
			kamers.add(new Kamer(1));
			
			System.out.println("Goede dag: welcom Hotel Fawlty Towers");
			System.out.println("Wilt u bij ons gaan reserveren");
			System.out.println("Toets ja als u wil bij ons gaan reserveren");
			Scanner scanner= new Scanner(System.in);
		boolean isOverboekt = false;
	while (isOverboekt== false) 
	{
		String invoer = scanner.next();
		if(invoer.equals("ja")){
			System.out.println("Toets u naam alstublieft");
		String newNaam = scanner.next();
		System.out.println("Met hoeveel personen wilt u gaan reserveren?");
		int aantalPersonen = scanner.nextInt();
		isBezet(aantalPersonen);	
			
		}else {
			System.out.println("Geen toegang");
			
		}
	}
	
			
}
		
	public static boolean isBezet(int newAantalPersonen) {
		boolean bezet = false; 
		int aantalBezetKamers = 0; 
		for(Kamer k:kamers)
		{
			if(k.aantalBedden == newAantalPersonen && newAantalPersonen == 4 )
			{
				aantalBezetKamers++;
				if(aantalBezetKamers == 2)
				{
					bezet = true;
					break;
				}
			}
			else	if(k.aantalBedden == newAantalPersonen && newAantalPersonen ==2  )
			{
				aantalBezetKamers++;
				if(aantalBezetKamers == 2)
				{
					bezet = true;
					break;
				}
			}
				
			else if(k.aantalBedden == newAantalPersonen && aantalBezetKamers == 1)
			{
				bezet = true;
				break;
			}
			
		}
			return bezet;
		}	 
	
}



