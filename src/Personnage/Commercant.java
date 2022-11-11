package Personnage;

public class Commercant extends Humain{
	
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateur !");
	}
	
	public int seFaireExtorquer() {
		parler(" J’ai tout perdu! Le monde est trop injuste... ");
		perdreArgent(getArgent());
		return getArgent();
	}
	
	
}