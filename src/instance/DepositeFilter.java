package instance;

import reference.Adjunce;
import reference.Bank;
import reference.Expunge;

import java.util.List;
import java.util.stream.Collectors;

public class DepositeFilter {

    public static List<InstanceDeposite> filtToPercent(List<InstanceDeposite> deposites, double percent) {
        return deposites.stream().filter(e -> e.getPercent() >= percent).collect(Collectors.toList());
    }

    public static List<InstanceDeposite> filtToAdjunce(List<InstanceDeposite> deposites, Adjunce adjunce) {
        return deposites.stream().filter(e -> e.getAdjunce().equals(adjunce)).collect(Collectors.toList());
    }

    public static List<InstanceDeposite> filtToExpunge(List<InstanceDeposite> deposites, Expunge expunge) {
        return deposites.stream().filter(e -> e.getExpunge().equals(expunge)).collect(Collectors.toList());
    }

    public static List<InstanceDeposite> filtToBank(List<InstanceDeposite> deposites, Bank bank) {
        return deposites.stream().filter(e -> e.getBank().equals(bank)).collect(Collectors.toList());
    }

    public static List<InstanceDeposite> filtToProfit(List<InstanceDeposite> deposites, double profit) {
        return deposites.stream().filter(e -> e.getProfit() >= profit).collect(Collectors.toList());
    }

}
