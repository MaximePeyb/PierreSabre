package personnages;

public class Yakuza extends Humain {
	
	private int reputation = 0;
	private String clan;
	
	public Yakuza(String nom, String Boisson, int argent, String clan) {
		super(nom, Boisson, argent);
		this.clan=clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		parler("J’ai piqué les "+gain+" sous de "+victime.getNom()+", ce qui me fait "+argent+" sous dans ma poche. Hi ! Hi !");
		reputation++;
	}

}
