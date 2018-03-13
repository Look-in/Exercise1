package instance;

import reference.Adjunce;
import reference.Expunge;

public abstract class Deposite {
    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	private String name;
	private double percent;
	private int period;
	private Adjunce adjunce;
	private Expunge expunge;
	
	
	public Deposite(String name, double percent, int period, Adjunce adjunce, Expunge expunge) {
		this.name=name;
		this.percent = percent;
		this.period = period;
		this.adjunce = adjunce;
		this.expunge = expunge;
	}


	public void setPercent(double percent) {
		this.percent = percent;
	}


	public void setPeriod(int period) {
		this.period = period;
	}

	public double getPercent() {
		return percent;
	}


	public int getPeriod() {
		return period;
	}
	
	public Adjunce getAdjunce() {
		return adjunce;
	}

	public void setAdjunce(Adjunce adjunce) {
		this.adjunce = adjunce;
	}

	public Expunge getExpunge() {
		return expunge;
	}

	public void setExpunge(Expunge expunge) {
		this.expunge = expunge;
	}

	@Override
	public String toString() {
		return "name="+name+" percent="+ percent + ", period=" + period + ", adjunce=" + adjunce.getDisplayName() + ", expunge="
				+ expunge.getDisplayName();
	}
	
	public abstract double getProfit();
	
	
}
