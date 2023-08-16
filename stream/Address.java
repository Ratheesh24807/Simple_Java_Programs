package in.Java8Features.stream;

public class Address {
	
	private String door_no;
	private String village;
	private String city;
	private String state;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(String door_no, String village, String city, String state) {
		super();
		this.door_no = door_no;
		this.village = village;
		this.city = city;
		this.state = state;
	}

	public String getDoor_no() {
		return door_no;
	}

	public void setDoor_no(String door_no) {
		this.door_no = door_no;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [door_no=" + door_no + ", village=" + village + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
