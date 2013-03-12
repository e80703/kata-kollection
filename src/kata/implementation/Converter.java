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

	// convert decimal to roman
	
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
	
	// convert roman to decimal
	
	private static Roman isRoman(String literal) {
		for (Roman rv : Roman.values()) {
			if (literal.equals(rv.toString())) {
				return rv;
			}
		}
		return null;
	}

	public static int toDecimal(String roman) {
		int value = 0;

		if (roman.length() == 1 || roman.length() == 2) {
			if (isRoman(roman) != null) {
				// sima "szotari" szam, pl I, IV, X, XL
				value = isRoman(roman).getDecimal();
			} else {
				// osszetett szam, pl II, VI, LX
				value = toDecimal(roman.substring(0, 1))
						+ toDecimal(roman.substring(1, 2));
			}
		} else if (roman.length() > 2) {
			// osszetett szam, pl III, XLVII, DCXXIV
			Roman rv = isRoman(roman.substring(0, 2));
			if (rv != null) {
				// duplaval kezdodik
				value = rv.getDecimal() + toDecimal(roman.substring(2));
			} else {
				// simaval kezdodik
				rv = isRoman(roman.substring(0, 1));
				if (rv != null) {
					value = rv.getDecimal() + toDecimal(roman.substring(1));
				}
			}
		}

		return value;
	}
	
}
