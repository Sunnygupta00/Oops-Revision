package oops;

// through getters and setters we can easily access private objects
public class O2_GettersAndSetters {
	public static void main(String[] args) {
		sample s = new sample("123");
		System.out.println(s.getPassword());
		s.setPassword("xxx");
		System.out.println(s.getPassword());
	}

}

class sample{
	private String password;
	sample(String x){
		this.password = x;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String x) {
		this.password = x;
	}
	
}
