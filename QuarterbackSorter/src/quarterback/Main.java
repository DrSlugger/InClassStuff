package quarterback;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Declare and instantiate an ArrayList of Quarterback objects
		// "Parameterized" ArrayList
		ArrayList<Quarterback> qbs = new ArrayList<Quarterback>();
		// Add Tom Brady to the Array List
		qbs.add(new Quarterback("Tom Brady", 5, 66159, 488));
		qbs.add(new Quarterback("Andy Dalton", 0, 25534, 167));
		qbs.add(new Quarterback("David Klingler", 0, 3994, 16));
		qbs.add(new Quarterback("Brett Favre", 1, 71838, 508));
		qbs.add(new Quarterback("Boomer Esiason", 0, 37920, 247));
		qbs.add(new Quarterback("Kiefer Cunningham", 0, 0, 0));
		
		Quarterback JT = new Quarterback("JT Barret IV", 0, 0, 0);
		qbs.add(JT);		
		
		for(Quarterback qb : qbs) {
			System.out.println(qb.getName() + ", " + qb.getCareerPassingTouchdowns());
		}
	}

}
