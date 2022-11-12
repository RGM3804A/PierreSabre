package Personnage;

public class Ronin extends Humain {
	int honneur = 1;

	public Ronin(String nom, String BoissonPreferee, int argent) {
		super(nom, BoissonPreferee, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = getArgent()/10;
		perdreArgent(don);
		parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
	}

}
