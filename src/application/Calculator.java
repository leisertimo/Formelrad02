package application;

/**
 * Berechnet das Formelrad
 * 
 * @author Peter Rutschmann
 * @version 13.09.2018
 */
public class Calculator {
	private double leistung;
	private double spannung;
	private double strom;
	private double widerstand;

	public Calculator(double leistung, double spannung, double strom, double widerstand) {
		super();
		this.leistung = leistung;
		this.spannung = spannung;
		this.strom = strom;
		this.widerstand = widerstand;
	}

	public double getLeistung() {
		return leistung;
	}

	public double getSpannung() {
		return spannung;
	}

	public double getStrom() {
		return strom;
	}

	public double getWiderstand() {
		return widerstand;
	}

	@Override
	public String toString() {
		return "Calculator [leistung=" + leistung + ", spannung=" + spannung + ", strom=" + strom + ", widerstand="
				+ widerstand + "]";
	}

	public void calculate() {
		if (spannung == 0 && widerstand != 0 && strom != 0) {
			spannung = uAusRundI(widerstand,strom);
		}
		if (spannung == 0 && leistung != 0 && strom != 0) {
			spannung = uAusPundI(leistung,strom);
		}
		if (spannung == 0 && leistung != 0 && widerstand != 0) {
			spannung = uAusPundR(leistung,widerstand);
		}
	}

	/*
	 * Hier die Methoden mit den Formlen hinzufügen
	 */
	public double uAusRundI(double r, double i) {
		return r * i;
	}

	public double uAusPundI(double p, double i) {
		return p / i;
	}

	public double uAusPundR(double p, double r) {
		return Math.sqrt(p * r);
	}
}
