package hello;

public class Employee {
	String fname;
	String lname;
	int age;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fn) {
		fname = fn;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String printObj(){
		
		return fname+" "+lname+" "+age;
		
	}

}
