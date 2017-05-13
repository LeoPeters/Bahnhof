package BahnhofSimulation;

import java.util.Scanner;

public class Zug extends Thread {
	private static int zugNummerZaehler = 0;
	private int zugNummer;
	private Scanner scanner = new Scanner(System.in);
	public Zug() {
		zugNummer =zugNummerZaehler++;
	}
	
	public int getZugNummer() {
		return zugNummer;
	}
	
	@Override
	public void run() {
		while(!isInterrupted()) {
			
		}
	}
	
	
}
