import Dao.DepositeDao;
import instance.DepositeComparator;
import instance.DepositeFilter;
import instance.DepositeFind;
import instance.InstanceDeposite;
import reference.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Чтение списка вкладов
        List<InstanceDeposite> deposites=DepositeDao.getInstance().readDeposite();
        //Сортировка по доходности
        AttributeToCompare attribute=AttributeToCompare.BANK;
        System.out.println("Сортировка депозитов по "+attribute.getDisplayName());
        DepositeComparator.compare(deposites, AttributeToCompare.BANK);
        deposites.forEach(e -> System.out.println(String.format("%.2f", e.getProfit()) + " " + e));
        System.out.println("Фильтр по процентам");
        DepositeFilter.filtToPercent(deposites, 7).forEach(System.out::println);
        System.out.println("Фильтр по банкам");
        DepositeFilter.filtToBank(deposites, Bank.BELARUSBANK).forEach(System.out::println);
        System.out.println("Поиск");
        System.out.println(DepositeFind.findBest(deposites,Adjunce.ADJUNCTIVE,Expunge.VOCABLE));
    }
}
