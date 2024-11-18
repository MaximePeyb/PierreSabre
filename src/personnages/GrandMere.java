package personnages;

import java.util.Random;

public class GrandMere extends Humain{
	
	private enum TypeHumain{
		RONIN,COMMERCANT,HUMAIN,SAMOURAI,YAKUZA,GRANDMERE
	}
	
	public GrandMere(String nom, int argent) {
		super(nom, "tisane", argent);
	}
	
	@Override
	protected void memoriser(Humain qqun) {
		if (nbConnaissances<5){
			memoire[nbConnaissances] = qqun;
			nbConnaissances++;
		} else{
			parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		}
	}
	
	public void ragoter() {
		for (int i = 0;i<nbConnaissances;i++) {
			if (memoire[i] instanceof Traitre) {
				parler("Je sais que "+memoire[i].getNom()+" est un traître. Je petit chenapan !");
			}
			else {
				String txt = "Je crois que "+memoire[i].getNom()+" est ";
				
				switch(humainHasard()) {
				case RONIN:
					txt+="un Ronin";
					break;
				case COMMERCANT:
					txt+="un commercant";
					break;
				case HUMAIN:
					txt+="un habitant";
					break;
				case SAMOURAI:
					txt+="un Samourai";
					break;
				case YAKUZA:
					txt+="un yakuza";
					break;
				case GRANDMERE:
					txt+="une grand-mère";
					break;
				}
				parler(txt);
			}
		}
	}

	private TypeHumain humainHasard() {
		return TypeHumain.values()[(new Random()).nextInt(0,6)];
	}
	
	
}
