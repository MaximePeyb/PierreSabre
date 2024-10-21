package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String args[]) {
		//Commercant marco = new Commercant("Marco", 15);
		Yakuza yaku = new Yakuza("Yaku le Noir", "whisky", 45, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 54);
		
		
		roro.provoquer(yaku);
		
	}

}