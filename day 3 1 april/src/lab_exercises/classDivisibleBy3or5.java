package lab_exercises;

public class classDivisibleBy3or5{


	int sum=0,num;

	public classDivisibleBy3or5(int num) {
	
		this.num = num;
		this.sum=0;
	}
	
	public void calculate(){
		
		for(int i=1;i<num;i++) {
			if(i%3==0 || i%5==0) {
				sum+= i;
			}
		}
	}

}

