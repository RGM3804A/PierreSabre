package Personnage;
import Personnage.Humain;

public class Commercant extends Humain{
	
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public void recevoir(int argent) {
		parler(argent + " sous ! Je te remercie généreux donateur !");
		argent = getArgent() + argent;
	}
	
	public int seFaireExtorquer() {
		parler(" J’ai tout perdu! Le monde est trop injuste... ");
		return 0;
	}
	
	
}