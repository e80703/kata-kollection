package kata.implementation;

/**
 *	kata description: convert a decimal number to roman and vica versa
 * 
 */
public class Converter {

	public enum Roman {
		I(1), IV(4), V(5), IX(9), 
		X(10), XL(40), L(50), XC(90), 
		C(100), CD(400), D(500), CM(900), M(1000);

		private final int decimal;

		private Roman(int i) {
			decimal = i;
		}

		public int getDecimal() {
			return decimal;
		}
	}

	private static Roman getLargestContaining(int i) {
		Roman largest = null;

		for (Roman rv : Roman.values()) {
			if (i >= rv.getDecimal()) {
				largest = rv;
			}
		}

		return largest;
	}

	public static String toRoman(int i) {

		StringBuffer sb = new StringBuffer();

		while (i > 0) {
			Roman largest = getLargestContaining(i);
			sb.append(largest.toString());
			i -= largest.getDecimal();
		}

		return sb.toString();
	}
	
}
