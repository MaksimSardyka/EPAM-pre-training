package part4;

public class Fibo {
	private static final int FIRST_ELEMENT = 0;
	private static final int SECOND_ELEMENT = 1;
	private static final int FIRST_ELEMENT_INDEX = 1;
	private static final int SECOND_ELEMENT_INDEX = 2;
	private static final int WRONG_INPUT_RESULT = -1;

	public static long findFiboNumber(int orderNumber) {
		long result;
		
		if (orderNumber <= SECOND_ELEMENT_INDEX) {
			result = WRONG_INPUT_RESULT;
			if (orderNumber == FIRST_ELEMENT_INDEX) {
				result = FIRST_ELEMENT;
			} else if (orderNumber == SECOND_ELEMENT_INDEX) {
				result = SECOND_ELEMENT;
			}
		} else {
			result = findFiboNumber(orderNumber - 1) + findFiboNumber(orderNumber - 2);
		}
		return result;
	}
}
