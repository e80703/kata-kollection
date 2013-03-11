package kata.implementation;

/*
 * http://en.wikipedia.org/wiki/Fizz_buzz
 */
public class FizzBuzz {

	public static String getValue(int number) {
		StringBuffer sb = new StringBuffer();
		
		if (number % 3 == 0) {
			sb.append("Fizz");
		}
		
		if (number % 5 == 0) {
			sb.append("Buzz");
		}

		if (sb.length() == 0) {
			sb.append((new Integer(number)).toString());
		}

		return sb.toString();
	}

}
