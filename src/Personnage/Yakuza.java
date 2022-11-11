package Personnage;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String BoissonPreferee, int argent, String clan) {
		super(nom,BoissonPreferee,argent);
		this.clan = clan ;
	}
	
	public void extorquer(Commercant victime) {
		reputation += 1;
		parler("Tiens, tiens, ne serait-pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int somme =victime.seFaireExtorquer();
		gagnerArgent(somme);
		parler("J'ai piqué le(s) " + somme + " de " + victime.getNom() + " ce qui me fait " + getArgent() + " dans ma poche. Hi ! Hi !");
	}
	

}
