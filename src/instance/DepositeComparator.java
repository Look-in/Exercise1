package instance;

import java.util.ArrayList;
import java.util.Collections;

import reference.AttributeToCompare;

public class DepositeComparator {

	public static void compare(ArrayList<Deposite> deposites, AttributeToCompare attribute) {
	switch (attribute) {	
	case PERCENT:
		Collections.sort(deposites,(o1,o2) -> (int)(o1.getPercent()-o2.getPercent()));
		break;
	case PERIOD:
		Collections.sort(deposites,(o1,o2) -> (o1.getPeriod()-o2.getPeriod()));
		break;	
	case PROFIT:
		Collections.sort(deposites,(o1,o2) -> (int)(o1.getProfit()-o2.getProfit()));
		break;	
	}
}
}
