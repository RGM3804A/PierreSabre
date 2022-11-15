package Personnage;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 1;

	public Yakuza(String nom, String boissonPreferee, int argent, String clan) {
		super(nom,boissonPreferee,argent);
		this.clan = clan ;
	}
	
	public int getReputation () {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		reputation++;
		parler("Tiens, tiens, ne serait-pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int somme =victime.seFaireExtorquer();
		gagnerArgent(somme);
		parler("J'ai piqué le(s) " + somme + " de " + victime.getNom() + " ce qui me fait " + getArgent() + " dans ma poche. Hi ! Hi !");
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan);
	}
	
	public int perdre() {
		reputation--;
		int butin = getArgent();
		perdreArgent(butin);
		parler("J'ai perdu mon duel et mes " + butin + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
		return butin;
	}
	
	public void gagner(int gain) {
		reputation++;
		gagnerArgent(gain);
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan " + clan + ".");
	}
	
}
