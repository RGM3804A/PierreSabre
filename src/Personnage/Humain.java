package Personnage;

public class Humain {
	private String nom;
	private String BoissonPreferee;
	private int argent;
	private int nbConnaissances = 0;
	private Humain[] memoire;
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
	public Humain(String nom, String BoissonPreferee, int argent) {
		this.nom = nom;
		this.BoissonPreferee = BoissonPreferee;
		this.argent = argent;
		memoire = new Humain[30];
	}
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void parler(String texte) {
		System.out.println("("+nom+") - " + texte);
	}
	
	public void memoriser(Humain humain) {
		if(nbConnaissances<30) {
			memoire[nbConnaissances] = humain;
			nbConnaissances++;
		}
	}
	
	public void repondre(Humain nouvelHumain) {
		direBonjour();
		memoriser(nouvelHumain);
	}
	
	public void faireConnaissanceAvecHumain(Humain autreHumain) {
		direBonjour();
		repondre();// pas trouver quel variables passer
		memoriser(autreHumain);
	}
	
	public void listerConnaissances() {
		parler("Je connais beaucoup de monde dont :");
		for(int i=0; i<nbConnaissances; i++) {
			System.out.println(memoire[i].getNom());
		}
	}
	
	public void direBonjour() {
		parler("Bonjour ! je m'appelle " + nom + " et j'aime boire du " + BoissonPreferee +".");
	}
	
	public void boire() {
		parler("Mmm un bon verre de " + BoissonPreferee + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix){
		argent=getArgent();
		if(prix<=argent) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix +" sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		}
	}
}
