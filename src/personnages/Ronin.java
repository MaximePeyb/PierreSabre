package personnages;

public class Ronin extends Humain{

	int honneur=1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant pauvre) {
		int don = argent/10;
		perdreArgent(don);
		parler(pauvre.getNom()+", prend ces "+don+" sous.");
		pauvre.recevoir(don);
	}
}
