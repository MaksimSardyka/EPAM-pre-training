package by.training.task2.part1;

public class Head {
	static int counter(int heads,int age){
		if(age<=200) {
			heads+=3*age;
		} else if(age<=300) {
			heads+=600 + (age-200)*2;
		} else {
			heads+=800 + age-300;
		}
		return heads;
	}
}
