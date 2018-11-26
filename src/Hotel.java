import java.util.ArrayList;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;



public class Hotel {
	static ArrayList<Kamer>  kamers = new ArrayList<>();
	//kamer met aantalBeddenen reserveringen creeren
	Hotel()
	{
		Reservering r = null; 
		kamers.add(new Kamer(4, r));
		kamers.add(new Kamer(4, r));
		kamers.add(new Kamer(2, r));
		kamers.add(new Kamer(2, r));
		kamers.add(new Kamer(1, r));
	}
	//Overzicht van reservering
	public void printKamers()
	{
		boolean alleKamersZijnLeeg = true; 
		for(Kamer k:kamers)
		{
			if(k.r != null)
			{
				alleKamersZijnLeeg = false;
				k.r.printReservering();
				System.out.println("\n\n");
			}
		}
		if (alleKamersZijnLeeg == true)
		{
			System.out.println("Alle kamers zijn leeg!");
		}
	}
	
	public void setKamer(int aantalPersonen, Reservering newReservering)
	{
		
		for(Kamer k: kamers)
		{
			if (k.aantalBedden == aantalPersonen && k.r == null)
			{
				k.r = newReservering;
				break;
			}
		}
	}
	// Check beschikbaarheid van de kamers
	public  boolean isBezet(int newAantalPersonen) {
		boolean bezet = true; 
		
		for(Kamer k:kamers)
		{
			if(k.aantalBedden == newAantalPersonen && k.r == null)
			{
				bezet = false;
			}
		}
			return bezet;
		}	
	public boolean alleKamersBezet()
	{
		boolean tempIsVol = true;
		for(Kamer k:kamers)
		{
			if (k.r == null)
			{
				tempIsVol = false;
				break;
			}
		}
		return tempIsVol;
	}
	
}



