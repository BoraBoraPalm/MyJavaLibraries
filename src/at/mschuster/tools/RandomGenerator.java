package at.mschuster.tools;

//
public final class RandomGenerator {

	// a) using final with calss:
	// A final class is simply a class that can't be extended.

	// b) using final with methods:
	// method can't be overridden (for object scope) or hidden (for static). This
	// allows the original developer to create functionality that cannot be changed
	// by subclasses, and that is all the guarantee it provides.
	///////////////////List<Integer> numbersRandomAll = new ArrayList<Integer>();

	public RandomGenerator() {

	}
	
	public static int getInt(int min, int max) {
		return (int) (Math.random() * max + min);
	}

	/*
	 * //generic method private <AnyType> boolean checkDouble(AnyType someInput,
	 * List<AnyType> listOfAllElements) { //nur noch liste durchfahren und checken
	 * boolean found = false; for(AnyType element : listOfAllElements) { if(element
	 * == someInput) { found = true; } } return found; }
	 */

	/*
	public int getInt(int min, int max, boolean allowSameDouble) {

		int numberRandom = (int) (Math.random() * max + min);
		// System.out.println(numbersRandomAll.size());

		if (allowSameDouble) {
			numbersRandomAll.add(numberRandom);
			return numberRandom;
		} else {

			// checke ob Liste leer ist
			if (numbersRandomAll.size() == 0) {
				// --> wenn schon
				// --> dann random wert akzeptieren!
				// System.out.println(numberRandom);
				numbersRandomAll.add(numberRandom);
				return numberRandom;
			} else if (numbersRandomAll.size() >= ((max - min) + 1)) {
				System.err.println("max possibilities for this range reached!");
				return -Integer.MAX_VALUE;
			} else {
				// --> wenn nicht
				// --> suche nicht bereits gespielte zahlen!
				boolean contains = numbersRandomAll.contains(numberRandom);
				if (contains == false) {
					// System.out.println(numberRandom);
					numbersRandomAll.add(numberRandom);
					return numberRandom;
				} else {
					// suche neue zahl aber nur so lange, wie es möglichkeiten gibt
					// int possibilitiesMax = (max - min) + 1;
					// int possibilitiesTried = 0;
					while (contains == true) {
						numberRandom = (int) (Math.random() * max + min);
						contains = numbersRandomAll.contains(numberRandom);
						// System.out.println(contains + " " + numberRandom);
					}
					// System.out.println(numberRandom);
					numbersRandomAll.add(numberRandom);
					return numberRandom;
				}
			}
		}
	}

	public double getDouble(double min, double max) {
		return Math.random() * max + min;
	}
*/
	public static String getName() {
		String[] names = { "Kurt", "Hans", "Fred", "Sepp", "Paul", "Klaus", "Matthias", "Oleander", "Lisa", "Anna" };

		// TODO: LEGITIM, instanz des Objects in sich selbst erstellen?
		// liefert wischen 0 und 9 zurück!
		return names[getInt(0, names.length - 1)];
	}

}
