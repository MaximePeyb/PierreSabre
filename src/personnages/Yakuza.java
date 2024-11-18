package personnages;

public class Yakuza extends Humain {
	
	private int reputation = 0;
	private String clan;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan=clan;
	}
	

	public int getReputation() {
		return reputation;
	}
	
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom()+", si tu tiens � la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		parler("J�ai piqu� les "+gain+" sous de "+victime.getNom()+", ce qui me fait "+getArgent()+" sous dans ma poche. Hi ! Hi !");
		reputation++;
	}
	
	public int perdre() {
		int perte = getArgent();
		parler("J�ai perdu mon duel et mes "+perte+" sous, snif... J'ai d�shonor� le clan de "+clan+".");
		perdreArgent(perte);
		reputation--;
		return perte;
	}
	
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre "+getNom()+" du clan de "+clan+" ? Je l'ai d�pouill� de ses 54 sous.");
		gagnerArgent(gain);
		reputation++;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de "+clan+".");
	}

}
