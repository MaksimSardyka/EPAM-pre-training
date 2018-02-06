package part1;

public class Head {
	static final int HEADS_BORN = 3;//number of heads dragon born with
	static final int EYES_PER_HEAD = 3;
	
	static final int AGE_PERIOD_1 = 200;
	static final int HEADS_GROW_IN_PERIOD_1 = 3;
	static final int AGE_PERIOD_2 = 300;
	static final int HEADS_GROW_IN_PERIOD_2 = 2;
	
	static int countHeads(int age){
		int heads = HEADS_BORN;
		if(age<=AGE_PERIOD_1) {
			heads+=HEADS_GROW_IN_PERIOD_1*age;
		} else if(age<=AGE_PERIOD_2) {
			heads+=AGE_PERIOD_1*HEADS_GROW_IN_PERIOD_1 + (age-AGE_PERIOD_1)*HEADS_GROW_IN_PERIOD_2;
		} else {
			heads+=AGE_PERIOD_1*HEADS_GROW_IN_PERIOD_1 + (AGE_PERIOD_2-AGE_PERIOD_1)*HEADS_GROW_IN_PERIOD_2 + age-AGE_PERIOD_2;
		}
		return heads;
	}
	
	static int countEyes(int numHeads) {
		return numHeads * EYES_PER_HEAD;
	}
}
