import java.util.ArrayList;

import entity.DepositeByn;
import entity.DepositeRur;
import instance.Deposite;
import instance.DepositeComparator;
import instance.DepositeFilter;
import reference.Adjunce;
import reference.AttributeToCompare;
import reference.Expunge;

public class Bank {

	public static void main(String[] args) {
		// Создание списка вкладов
		ArrayList<Deposite> deposites = new ArrayList<>();
		// Заполнение списка
		deposites.add(new DepositeByn("Deposite1", 9, 12, Adjunce.ADJUNCTIVE, Expunge.VOCABLE));
		deposites.add(new DepositeByn("Deposite2", 7, 7, Adjunce.ADJUNCTIVE, Expunge.VOCABLE));
		deposites.add(new DepositeByn("Deposite3", 11, 12, Adjunce.NONADJUNCTIVE, Expunge.IRREVOCABLE));
		deposites.add(new DepositeRur("Deposite4", 4, 6, Adjunce.NONADJUNCTIVE, Expunge.IRREVOCABLE));
		deposites.add(new DepositeRur("Deposite5", 3, 12, Adjunce.ADJUNCTIVE, Expunge.VOCABLE));
		//Сортировка по доходности
		DepositeComparator.compare(deposites, AttributeToCompare.PROFIT);
		//Вывод на экран
		for (Deposite deposite : deposites) {
			System.out.print(deposite.getProfit() + " ");
			System.out.println(deposite.toString());
		}
		
	
	for (Deposite deposite : DepositeFilter.filtTo(deposites, AttributeToCompare.ADJUNCTIVE)) {
		//System.out.print(deposite.getProfit() + " ");
		System.out.println(deposite.toString());
	}
		
	}
}
