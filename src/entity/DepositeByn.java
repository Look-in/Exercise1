package entity;

import instance.Deposite;
import instance.InstanceDeposite;
import reference.Adjunce;
import reference.Bank;
import reference.Expunge;

public class DepositeByn extends Deposite implements InstanceDeposite {


    public DepositeByn(Bank bank, String name, double percent, int period, Adjunce adjunce, Expunge expunge) {
        super(bank, name, percent, period, adjunce, expunge);
    }

    @Override
    public double getProfit() {
        return getPercent()*getPeriod() / 12  ;
    }

    @Override
    public String toString() {
        return "DepositeByn " + super.toString();
    }
}
