package entity;

import instance.Deposite;
import reference.Adjunce;
import reference.Expunge;

public class DepositeByn extends Deposite{

   
	public DepositeByn(String name, double percent, int period, Adjunce adjunce, Expunge expunge) {
		super(name, percent, period, adjunce, expunge);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getProfit(){
		return getPeriod()*getPercent()/12;	
	}

	@Override
	public String toString() {
		return "DepositeByn ["+ super.toString()+"]";
	}
}
