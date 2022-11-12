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
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand.");
		int force = 2*honneur;
		int reputation = adversaire.getReputation();
		
		if(force >= reputation) {
			parler("Je t’ai eu petit yakusa!");
			int gain = adversaire.perdre();
			gagnerArgent(gain);
			
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			int perte = getArgent();
			perdreArgent(perte);
			adversaire.gagner(perte);
		}
	}
}