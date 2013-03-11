package kata.implementation;

public class DecToRoman {

	public enum Roman {
		I(1), IV(4), V(5), IX(9), 
		X(10), XL(40), L(50), XC(90), 
		C(100), CD(400), D(500), CM(900), M(1000);

		private final int decValue;

		private Roman(int i) {
			decValue = i;
		}

		public int getDecValue() {
			return decValue;
		}
	}

	private static Roman getLargestContaining(int i) {
		Roman largest = null;
		
		for (Roman rv : Roman.values()) {
			if (i >= rv.getDecValue()) {
				largest = rv;
			}
		}
		
		return largest;
	}
	
	public static String convert(int i) {

		StringBuffer sb = new StringBuffer();
		
		while (i > 0) {
			Roman l = getLargestContaining(i);
			sb.append(l.toString());
			
			i -= l.getDecValue();
		}
		
		return sb.toString();
	
	}
}
