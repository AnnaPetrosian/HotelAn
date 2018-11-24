
public class Kamer {
	
 private Reservering r = null;
 	 int aantalBedden = 0;
 
		Kamer(int aantalBedden ){
 		this.aantalBedden = aantalBedden;
 	}
		void setReservering(Reservering newReservering)
		{
			this.r = newReservering;
		}
		
}
