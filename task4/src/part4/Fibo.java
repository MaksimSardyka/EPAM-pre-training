package part4;

public class Fibo {
	private static final int FIRST_ELEMENT=0;
	private static final int SECOND_ELEMENT=1;
	
	public static long getByOrderNumber(int orderNumber){
		if(orderNumber<=2) {
			int current =-1;
			
			if(orderNumber==1) {
				current =FIRST_ELEMENT;
			} else if(orderNumber==2) {
				current =SECOND_ELEMENT;
			}
			
			return current;
		}
		return getByOrderNumber(orderNumber-1)+getByOrderNumber(orderNumber-2);
	}
}
