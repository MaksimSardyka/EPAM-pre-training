package part1;

public class Head {
	static final int HEADS_BORN = 3;//number of heads dragon born with
	static final int EYES_PER_HEAD = 3;
	
	static int countHeads(int age){
		int heads = HEADS_BORN;
		if(age<=200) {
			heads+=3*age;
		} else if(age<=300) {
			heads+=200*3 + (age-200)*2;
		} else {
			heads+=200*3 + 100*2 + age-300;
		}
		return heads;
	}
	
	static int countEyes(int numHeads) {
		return numHeads * EYES_PER_HEAD;
	}
}
