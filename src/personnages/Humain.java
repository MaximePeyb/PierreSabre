package personnages;

public class Humain {
	private String nom;
	private String boissonFav; 
	private int argent;
	private int nbConnaissances = 0;
	private Humain[] memoire = new Humain[30];
	
	
	public Humain(String pfnom, String pfBoisson, int pfargent) {
		nom = pfnom;
		boissonFav = pfBoisson;
		argent = pfargent;
		for (int i=0;i<memoire.length; i++){
			memoire[i]=null;
		}
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
	
	protected void gagnerArgent(int gain) {
		argent+=gain;
	}
	
	protected void perdreArgent(int perte) {
		argent-=perte;
	}
	
	
	
	public void faireConnaissanceAvec(Humain newH){
		direBonjour();
		newH.repondre(this);
		memoriser(newH);
	}

	private void memoriser(Humain newH){
		if (nbConnaissances<memoire.length){
			memoire[nbConnaissances] = newH;
			nbConnaissances++;
		} else{
			nbConnaissances = 0;
			memoriser(newH);
		}
	}

	private void repondre(Humain qqun){
		direBonjour();
		memoriser(qqun);
	}


	public void listerConnaissance(){
		String txt ="Je connais beaucoup de monde dont : ";
		for (int i=0;i<memoire.length;i++){
			if(memoire[i]!=null){
				txt = txt.concat(memoire[i].getNom() + "  ");
			}
		}
		parler(txt);
	}
	
	
	public static void main(String[] args) {
		
	}

}
