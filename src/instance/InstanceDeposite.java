package instance;

import reference.Adjunce;
import reference.Bank;
import reference.Expunge;

public interface InstanceDeposite {

    Adjunce getAdjunce();

    Expunge getExpunge();

    double getProfit();

    double getPercent();

    int getPeriod();

    Bank getBank();
}
