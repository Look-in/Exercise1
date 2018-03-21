package instance;

import reference.Adjunce;
import reference.Bank;
import reference.Expunge;

public abstract class Deposite implements InstanceDeposite {

    private String name;
    private double percent;
    private int period;
    private Adjunce adjunce;
    private Expunge expunge;
    private Bank bank;

    public Deposite(Bank bank, String name, double percent, int period, Adjunce adjunce, Expunge expunge) {
        this.bank=bank;
        this.name = name;
        this.percent = percent;
        this.period = period;
        this.adjunce = adjunce;
        this.expunge = expunge;
    }
    @Override
    public Bank getBank() {
        return bank;
    }

    @Override
    public double getPercent() {
        return percent;
    }

    @Override
    public int getPeriod() {
        return period;
    }

    @Override
    public Adjunce getAdjunce() {
        return adjunce;
    }

    public void setAdjunce(Adjunce adjunce) {
        this.adjunce = adjunce;
    }

    @Override
    public Expunge getExpunge() {
        return expunge;
    }

    public void setExpunge(Expunge expunge) {
        this.expunge = expunge;
    }

    @Override
    public String toString() {
        return "bank="+ bank.getDisplayName()+" name=" + name + " percent=" + percent + ", period=" + period + ", adjunce=" + adjunce.getDisplayName() + ", expunge="
                + expunge.getDisplayName();
    }

}
