package exerciseOneConTwo;

public class ExerciseOneConTwo {

	public static void main(String[] args) {
		System.out.println(conditionaltwo(0,2, false));
		System.out.println(conditionaltwo(2,2, true));
	}
	public static int conditionaltwo(int c, int d, boolean parameters){
			if(parameters == true) {
				return(c+d);
			}
			
			if(c==0 && d!=0) {
				return(d);
			}
			else if(c!=0 && d==0) {
				return(c);
			}
			return d;		
	}
}
