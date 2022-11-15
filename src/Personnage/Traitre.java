package Personnage;

import java.util.Random;

public class Traitre extends Samourai{
	private int traitrise;

	public Traitre(String seigneur, String nom, String BoissonPreferee, int argent) {
		super(seigneur,nom,BoissonPreferee,argent);
		this.traitrise = 0;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : " + traitrise + ". Chut !");
	}
	
	public void faireLeGentil() {
		if (getNbConnaissances() < 1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif");
		}else {
			Random random = new Random();
			int i = random.nextInt(0, getNbConnaissances()-1);
			Humain ami = getMemoire()[i];
			int don = getArgent()*1/20;
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + ami.getNom());
			parler("Bonjour l'ami ! "+ "Je voudrai vous aider en donnant " + don);
			perdreArgent(don);
			ami.gagnerArgent(don);
			ami.parler("Merci" + getNom() + ". Vous êtes quelqu'un de bien.");
			traitrise--;
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
