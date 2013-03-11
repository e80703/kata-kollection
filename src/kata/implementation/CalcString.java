package kata.implementation;


/**
 * extra v�ltozat:
 * input egy string: sz�mok vesszovel elv�lasztva
 * adja �ssze a sz�mokat
 * rekurzi�: ha az �sszeg t�bb sz�mjegyu, akkor ajda �ssze a sz�mjegyeket 
 */

public class CalcString {

	public static String add() {
		return null;
	}

	public static int add(String input) {
		if (input == "") {
			return 0;
		} else if (isStringValid(input)) {
			String[] tokens = input.split(",");
			return sumStrings(tokens);
		}
		
		return 0;
	}

	private static boolean isStringValid(String input) {
		return input.matches("((-?[0-9]+),?)*");
	}

	private static int sumStrings(String[] tokens) {
		int ret = 0;
		
		for (String number : tokens) {
			ret += Integer.parseInt(number);
		}
		
		return ret;
	}

}
