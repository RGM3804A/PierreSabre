package Personnage;

public class Humain {
	private String nom;
	private String boissonPreferee;
	private int argent;
	private int nbConnaissances = 0;
	private Humain[] memoire;

	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	public int getNbConnaissances() {
		return nbConnaissances;
	}
	public Humain[] getMemoire() {
		return memoire;
	}

	public Humain(String nom, String boissonPreferee, int argent) {
		this.nom = nom;
		this.boissonPreferee = boissonPreferee;
		this.argent = argent;
		memoire = new Humain[3];
	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}

	public void perdreArgent(int perte) {
		argent -= perte;
	}

	public void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}

	public void memoriser(Humain humain) {
		if (nbConnaissances < 3) {
			memoire[nbConnaissances] = humain;
			nbConnaissances++;
		} else {
			int i=0;
			Humain dernierePersonne = memoire[i];
			while(i < nbConnaissances){
				memoire[i]=humain;
				humain=dernierePersonne;
				i+=1;
			}
		}
	}

	public void repondre(Humain nouvelHumain) {
		nouvelHumain.direBonjour();
		memoriser(nouvelHumain);
	}

	public void faireConnaissanceAvecHumain(Humain autreHumain) {
		autreHumain.direBonjour();
		autreHumain.repondre(this);// pas trouver quel variables passer
		memoriser(autreHumain);
	}

	public void listerConnaissances() {
		String texte = "Je connais beaucoup de monde dont : ";
		for (int i = 0; i < nbConnaissances; i++) {
			texte+=memoire[i].getNom()+ " ,";
		}
		parler(texte);
	}

	public void direBonjour() {
		parler("Bonjour ! je m'appelle " + nom + " et j'aime boire du " + boissonPreferee + ".");
	}

	public void boire() {
		parler("Mmm un bon verre de " + boissonPreferee + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix
					+ " sous.");
		}
	}
}
