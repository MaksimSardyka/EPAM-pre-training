package part5;

public class Iterative {
	public static String hanoi(int numberOfRings, char sourceTower, char targetTower, char temporaryTower ) {
			char [] towers = {sourceTower, targetTower, temporaryTower};
			StringBuilder str = new StringBuilder();	
			
	        int limit = (int)Math.pow(2,numberOfRings)-1; // number of all iterations
	        
	        for(int i=0;i<limit;i++){
	            int currentDisk = getDisk(i); // disk that I move on this iteration
	            int source = ( calcMovements(i,currentDisk)*getDirection(currentDisk,numberOfRings))%3; //find source tower
	            int target = (source + getDirection(currentDisk,numberOfRings))%3; // find target tower
	            str.append(towers[source] + "-->" + towers[target]+"\n");
	        }  
	        
	        return str.toString();
	    }
	    private static int getDisk(int i) { //which disk I will move
	        int counter;
	        int x= i+1;
	        for(counter=0;x%2==0;counter++){
	            x/=2;
	        }
	        return counter;
	    }
	    private static int calcMovements(int i, int currentDisk) { //how many times this disk has been moved
	        while(currentDisk--!=0) {
	            i/=2;
	        }
	        return (i+1)/2;
	    }
	    private static int getDirection(int currentDisk,int numberOfRings) { //direction for this disk: clockwise=1, anticlockwise=2
	        return 2 - (numberOfRings + currentDisk)%2;
	    }
}