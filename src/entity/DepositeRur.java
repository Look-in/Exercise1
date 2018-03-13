package entity;

import instance.Deposite;
import reference.Adjunce;
import reference.Currency;
import reference.Expunge;

public class DepositeRur extends Deposite{

	public DepositeRur(String name, double percent, int period, Adjunce adjunce, Expunge expunge) {
		super(name, percent, period, adjunce, expunge);
		// TODO Auto-generated constructor stub
	}

	private final Currency currency=Currency.RUR;
   
	@Override
	public double getProfit(){
		return currency.getRate()*getPeriod()*getPercent()/12;	
	}
	
	@Override
	public String toString() {
		return "DepositeRur [currency=" + currency + " " +super.toString()+ "]";
	}	

}
