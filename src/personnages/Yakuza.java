package personnages;

public class Yakuza extends Humain {
	
	private int reputation = 0;
	private String clan;
	
	public Yakuza(String nom, String Boisson, int argent, String clan) {
		super(nom, Boisson, argent);
		this.clan=clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom()+", si tu tiens � la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		parler("J�ai piqu� les "+gain+" sous de "+victime.getNom()+", ce qui me fait "+argent+" sous dans ma poche. Hi ! Hi !");
		reputation++;
	}

}
