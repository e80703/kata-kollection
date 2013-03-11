package kata.implementation;

/**
 *	kata description: decide if a number is odd, even or prime 
 *		return "even" if number is even
 *		return "odd" if odd, but not prime
 *		return the number if prime
 *
 */
public class OddEvenPrime {

	public static String detect(int n) {
		StringBuffer sb = new StringBuffer();

		if (n == 1) {
			sb.append("Odd");
		} else if (n > 3) {
			if (isEven(n)) {
				sb.append("Even");
			} else {
				if (isPrime(n)) {
					sb.append(n);
				} else {
					sb.append("Odd");
				}
			}
		} else /* 2,3 */{
			sb.append(n);
		}

		return sb.toString();
	}

	private static boolean isEven(int n) {
		return n % 2 == 0;
	}

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}

		// fast even test.
		if (n > 2 && (n & 1) == 0) {
			return false;
		}

		// only odd factors need to be tested up to n^0.5
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}
