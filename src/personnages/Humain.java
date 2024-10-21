package personnages;

public class Humain {
	private String nom;
	private String boissonFav; 
	private int argent;
	
	
	public String getNom() {
		return nom;
	}

	public String getBoissonFav() {
		return boissonFav;
	}

	public int getArgent() {
		return argent;
	}


	private void parler(String txt) {
		System.out.println("("+this.nom+")" + " - "+txt);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+ nom +" et j'aime boire du "+boissonFav);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+ boissonFav +" ! GLOUPS ! ");
	}
	
	public void acheter(String bien, int prix) {
		
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
