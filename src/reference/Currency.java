package reference;

public enum Currency {
	RUR("Rur",0.35), EUR("Euro",2.45), USD("Usd",2.02);

	private final double rate;
	private final String currency;

	private Currency(String currency, double rate) {
		this.currency = currency;
		this.rate = rate;
	}

	public double getRate() {
		return rate;
	}
	
	public String getCurrency() {
		return currency;
	}	
}