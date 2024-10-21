package personnages;

public class Ronin extends Humain{

	private int honneur=1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant pauvre) {
		int don = getArgent()/10;
		perdreArgent(don);
		parler(pauvre.getNom()+", prend ces "+don+" sous.");
		pauvre.recevoir(don);
	}
	
	public void provoquer(Yakuza adv) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		
		if (adv.getReputation() <= 2*honneur) {
			parler("Je t’ai eu petit yakusa!");
			honneur++;
			gagnerArgent(adv.perdre());
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adv.gagner(getArgent());
			perdreArgent(getArgent());
			honneur--;
		}
	}
}
