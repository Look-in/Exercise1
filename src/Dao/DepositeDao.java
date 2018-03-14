package Dao;

import entity.DepositeByn;
import entity.DepositeCurrency;
import instance.InstanceDeposite;
import reference.Adjunce;
import reference.Bank;
import reference.Currency;
import reference.Expunge;

import java.util.ArrayList;
import java.util.List;

public class DepositeDao {

    private DepositeDao() {
    }

    private static DepositeDao instance;

    public static DepositeDao getInstance() {
        if (instance == null) {
            instance = new DepositeDao();
        }
        return instance;
    }

    public List<InstanceDeposite> readDeposite() {
        List<InstanceDeposite> deposites = new ArrayList<>();
        // Заполнение списка
        deposites.add(new DepositeByn(Bank.BELAPB, "Deposite1", 12, 12, Adjunce.ADJUNCTIVE, Expunge.VOCABLE));
        deposites.add(new DepositeByn(Bank.BELARUSBANK, "Deposite2", 11, 12, Adjunce.ADJUNCTIVE, Expunge.VOCABLE));
        deposites.add(new DepositeByn(Bank.BELINVEST, "Deposite3", 7, 7, Adjunce.ADJUNCTIVE, Expunge.VOCABLE));
        deposites.add(new DepositeByn(Bank.BELARUSBANK, "Deposite4", 11, 12, Adjunce.NONADJUNCTIVE, Expunge.IRREVOCABLE));
        deposites.add(new DepositeCurrency(Bank.BELAPB, Currency.RUR, "Deposite5", 4, 6, Adjunce.NONADJUNCTIVE, Expunge.IRREVOCABLE));
        deposites.add(new DepositeCurrency(Bank.BELARUSBANK, Currency.RUR, "Deposite6", 3, 12, Adjunce.ADJUNCTIVE, Expunge.VOCABLE));
        return deposites;
    }
}
