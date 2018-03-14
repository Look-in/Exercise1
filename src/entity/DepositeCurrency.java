package entity;

import instance.Deposite;
import instance.InstanceDeposite;
import reference.Adjunce;
import reference.Bank;
import reference.Currency;
import reference.Expunge;

public class DepositeCurrency extends Deposite implements InstanceDeposite{

	private Currency currency;

	public DepositeCurrency(Bank bank, Currency currency, String name, double percent, int period, Adjunce adjunce, Expunge expunge) {
		super(bank, name, percent, period, adjunce, expunge);
		this.currency=currency;
	}
   
	@Override
	public double getProfit(){
		return currency.getRate()*getPercent()*getPeriod()/12;
	}

	@Override
	public String toString() {
		return "DepositeCur "+super.toString()+" currency=" + currency.getCurrency();
	}

}
