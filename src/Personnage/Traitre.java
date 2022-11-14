package Personnage;

public class Traitre extends Samourai{
	private int traitrise;

	public Traitre(String seigneur, String nom, String BoissonPreferee, int argent) {
		super(seigneur,nom,BoissonPreferee,argent);
		this.traitrise = 0;
	}
	
	@Override
	public void direBonjour() {
		direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : " + traitrise + ". Chut !");
	}
	
	public void faireLeGentil() {
		if (nbConnaissances < 1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif");
		}
	}
	
	public void rançonner(Commercant commercant) {
		if(traitrise < 3) {
			traitrise++;
			int rancon = commercant.getArgent() * 2/10;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " + rancon + " sous ou gare à toi !");
			commercant.perdreArgent(rancon);
			gagnerArgent(rancon);
			commercant.parler("Tout de suite grand " + getNom());
		} else {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
	}

}
