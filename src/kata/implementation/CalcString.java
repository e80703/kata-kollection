package kata.implementation;

/**
 *	kata description: create a calculator with a method int Add(string numbers)
 *		the method can take 0, 1 or 2 numbers, and will return their sum
 *		for an empty string it will return 0
 *		allow the Add method to handle an unknown amount of numbers
 *		support different delimiters
 *
 *	extra: create a function which takes a number as an input
 *		if the input of the function has more than one digit then summarize the digits
 *		do this until it is possible
 *
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
