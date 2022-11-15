package Personnage;

public class Samourai extends Ronin{
	private String seigneur;

	public Samourai(String seigneur, String nom, String BoissonPreferee, int argent) {
		super(nom,BoissonPreferee,argent);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + seigneur);
	}
	
	@Override
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson);
	}
}