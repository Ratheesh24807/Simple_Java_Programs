package in.mixedtypeProblems;

public class Dummy {
	
	
	int id ;
	String name;
	String gender;
	String color;
	public Dummy(int id, String name, String gender, String color) {
		
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.color = color;
	}
	public static void main (String[] args ) {
		
		Dummy D = new Dummy(101,"Ravi","Male","White");
		System.out.println(D.color);
		
		
	}
	@Override
	public String toString() {
		return "Dummy [id=" + id + ", name=" + name + ", gender=" + gender + ", color=" + color + "]";
	}
	

}
