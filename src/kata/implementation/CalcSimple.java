package kata.implementation;

/*
 *	http://tddkatas.codeplex.com/documentation
 *
 * 	process a sequence of integer numbers
 *	to determine the following statistics:
 *
 *	minimum value
 *	maximum value
 *	number of elements in the sequence
 *	average value
 *
 */
public class CalcSimple {

	private int[] sequence;

	/*
	public Calc() {
		//setSequence(null);
	}
	*/

	public int[] getSequence() {
		return sequence;
	}

	public void setSequence(int[] sequence) {
		if (sequence != null && sequence.length > 0) {
			this.sequence = sequence;
		}
	}

	public int getMin() {
		int min = sequence[0];

		for (int i : sequence) {
			if (i < min) {
				min = i;
			}
		}

		return min;
	}

	public int getMax() {
		int max = sequence[0];

		for (int i : sequence) {
			if (i > max) {
				max = i;
			}
		}

		return max;
	}

	public int length() {
		return sequence.length;
	}

	public int getAverage() {
		int sum = 0;

		for (int i : sequence) {
			sum += i;
		}

		return (int) sum / sequence.length;
	}

}
