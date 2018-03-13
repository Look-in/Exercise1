package instance;

import java.util.ArrayList;
import java.util.stream.Collectors;

import reference.AttributeToCompare;

public class DepositeFilter {
	
	public static ArrayList<Deposite> filtTo(ArrayList<Deposite> deposites, AttributeToCompare attribute) {
	switch (attribute) {
	ArrayList<Deposite> filtered=null;
	case ADJUNCTIVE:
		filtered=(ArrayList<Deposite>) deposites.stream().filter(e -> e.getAdjunce().equals(attribute.ADJUNCTIVE)).collect(Collectors.toList());
		break;
	}
	return filtered;
	}

}
