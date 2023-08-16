package in.mixedtypeProblems;

public class TypeCons {

	private String name;
	private int rollno;
	private String school;

	public TypeCons() {
		// TODO Auto-generated constructor stub
	}
 
	
		
	public TypeCons(String name, int rollno, String school) {
		
		this.name = name;
		this.rollno = rollno;
		this.school = school;
	
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	public static void main(String[] args) {
		
	
	
	TypeCons c = new TypeCons("Raju",101,"Sea");
	System.out.println("Before changes");
	System.out.println(c.school + "  " + c.name +  " " +c.rollno);
	
	c.setSchool("EPCET");
	System.out.println("After changes");
	System.out.println(c.school + "  " + c.name +  " " +c.rollno);
	
	}

}
