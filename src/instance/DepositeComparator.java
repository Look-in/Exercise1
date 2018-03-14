package instance;

import java.util.List;

import reference.AttributeToCompare;

public class DepositeComparator {

    public static void compare(List<InstanceDeposite> deposites, AttributeToCompare attribute) {
        switch (attribute) {
            case PERCENT:
                deposites.sort((o1, o2) -> (int) (o1.getPercent() - o2.getPercent()));
                break;
            case PERIOD:
                deposites.sort((o1, o2) -> (o1.getPeriod() - o2.getPeriod()));
                break;
            case PROFIT:
                deposites.sort((o1, o2) -> (int) (o1.getProfit() - o2.getProfit()));
                break;
            case ADJUNCE:
                deposites.sort((o1, o2) -> (o1.getAdjunce().compareTo(o2.getAdjunce())));
                break;
            case EXPUNGE:
                deposites.sort((o1, o2) -> (o1.getExpunge().compareTo(o2.getExpunge())));
                break;
            case BANK:
                deposites.sort((o1, o2) -> (o1.getBank().compareTo(o2.getBank())));
                break;
        }
    }
}
