package histoire;

import Personnage.Humain;
import Personnage.Commercant;
import Personnage.Yakuza;
import Personnage.Ronin;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.faireConnaissanceAvecHumain(marco);
		yaku.faireConnaissanceAvecHumain(marco);
		chonin.faireConnaissanceAvecHumain(marco);
		kumi.faireConnaissanceAvecHumain(marco);
		marco.listerConnaissances();
		roro.listerConnaissances();
		yaku.listerConnaissances();
		
	}
}
