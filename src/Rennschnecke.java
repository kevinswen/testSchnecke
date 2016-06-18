import java.util.Random;


public class Rennschnecke {

	private String name;
	private String rasse;
	private int maxSp;
	private int strecke;

	public Rennschnecke(String name, String rasse, int maxSp, int strecke) {
		this.name =name;
		this.rasse=rasse;
		this.maxSp=maxSp;
	}
	public String getName() {
		return name;
	}
	public String getRasse() {
		return rasse;
	}
	public int getMaxSp() {
		return maxSp;
	}
	public int getStrecke() {
		return strecke;
	}
	//Lässt eine Schnecke eine zufällige Strecke zwischen 1 und ihrer
	//Maximalgeschwindigkeit weiterkriechen
	public void krieche() {
		Random rnd = new Random();
		strecke=strecke + (1+rnd.nextInt(maxSp));
	}
	//Erstellt aus den Daten einer Schnecke einen String und gibt ihn zurück
	public String toString(){
		return String.format("Name:\t"+name+"\nRasse:\t"+rasse+"\nHöchstgeschwindigkeit:\t"+maxSp+"\nStrecke:\t"+strecke);
	}
}