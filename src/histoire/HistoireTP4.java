package histoire;
import Personnage.Humain;
import Personnage.Commercant;

public class HistoireTP4 {
	
	
	public static void main(String[] args) {
		Humain prof = new Humain("Prof","Kombucha",54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		Commercant Marco = new Commercant("Marco", 20);
		Marco.direBonjour();
		Marco.seFaireExtorquer();
		Marco.recevoir(15);
		Marco.boire();
	}

}
