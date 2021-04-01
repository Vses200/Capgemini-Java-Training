package lab_exercises;

public class classDiffSqOSandSOSq {
	int limit;
	int sqOS;//square OF SUM
	int SOsq;//SUM OF square
	
	public classDiffSqOSandSOSq(int limit) {
		super();
		this.limit = limit;
	}
	
	public void findDifference() {
		
		for(int i=1;i<limit;i++) {
			SOsq+=i*i;
			sqOS+=i;
		}
		sqOS *= sqOS;
		System.out.println("Difference of Sum of Squares and Square of sum is :\n"+(sqOS-SOsq));
	}

	
}
