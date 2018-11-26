

public class Reservering {
	
	Persoon boeker;
	int aantalPersonenDieMeereizen;
    int aantalDagen;

	
	Reservering(Persoon boeker,int aantalPersonenDieMeereizen, int aantalDagen){
		this.boeker = boeker;
		this.aantalPersonenDieMeereizen = aantalPersonenDieMeereizen;
		this.aantalDagen = aantalDagen;
		
	}
	 
	public void printReservering()
	{
		System.out.println("Naam:\t"+this.boeker.naam);
		System.out.println("AantalPersonen:\t"+this.aantalPersonenDieMeereizen);
		System.out.println("Aantal dagen:\t"+this.aantalDagen);
	}
	}
	

