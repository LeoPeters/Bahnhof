package BahnhofSimulation;
//import java.io.Serializable;
import java.util.concurrent.Semaphore;
public class Bahnhof {
	private int anzahlGleise;
	private Zug[] gleise;
	private int anzahlZufahrtsGleise;
	private String name;
	
	public Bahnhof(String name,int anzahlGleise, int anzahlZufahrtsGleise) {
		this.name = name;
		this.anzahlGleise = anzahlGleise;
		this.anzahlZufahrtsGleise = anzahlZufahrtsGleise;
		gleise = new Zug[anzahlGleise];
		Semaphore semaphore = new Semaphore(anzahlZufahrtsGleise);
	}
	
	public Bahnhof() {
		this.name = "Bahnhof";
		anzahlGleise = 10;
		anzahlZufahrtsGleise = 3;
		gleise = new Zug[anzahlGleise];
		Semaphore semaphore = new Semaphore(anzahlZufahrtsGleise);
	}
	
	public void aufGleisEinfahren(int gleis) {
		
	}
	
	public void ausGleisAusfahren() {
		
	}
}
