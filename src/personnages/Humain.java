package personnages;

public class Humain {
	private String nom;
	private String boissonFav; 
	private int argent;
	
	public Humain(String pfnom, String pfBoisson, int pfargent) {
		nom = pfnom;
		boissonFav = pfBoisson;
		argent = pfargent;
	}
	
	
	public String getNom() {
		return nom;
	}

	public String getBoissonFav() {
		return boissonFav;
	}

	public int getArgent() {
		return argent;
	}


	protected void parler(String txt) {
		System.out.println("("+this.nom+")" + " - "+txt);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+ nom +" et j'aime boire du "+boissonFav);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+ boissonFav +" ! GLOUPS ! ");
	}
	
	public void acheter(String bien, int prix) {
		if(argent>=prix) {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir un "+bien+" à "+prix+" sous.");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux même pas m'offrir un "+bien+" à "+prix+" sous.");
		}
	}
	
	public void gagnerArgent(int gain) {
		argent+=gain;
	}
	
	public void perdreArgent(int perte) {
		argent-=perte;
	}


	public static void main(String[] args) {
		
	}

}
