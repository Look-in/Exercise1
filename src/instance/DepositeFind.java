package instance;

import reference.Adjunce;
import reference.Expunge;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class DepositeFind {

    public static Optional<InstanceDeposite> findBest(List<InstanceDeposite> deposites, Adjunce adjunce, Expunge expunge) {
        return deposites.stream()
                .filter(e -> e.getAdjunce().equals(adjunce))
                .filter(e -> e.getExpunge().equals(expunge))
                .sorted(Comparator.comparing(InstanceDeposite::getProfit).reversed())
                .findFirst();
    }

}
