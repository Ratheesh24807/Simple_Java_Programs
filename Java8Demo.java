package in.mixedtypeProblems;

public class Java8Demo {

			//Without Lambda EXP
		
			public boolean check(int i) {
				
				if(i>=60) {
					return true;
				}else {
					return false;
				}
			}
			

			public static void main(String[] args) {
				
			
				Java8Demo JD = new Java8Demo();
				System.out.println(JD.check(12));
		}

}