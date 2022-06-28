import java.util.GregorianCalendar;

public class ITSupportRequests {
	
	GregorianCalendar cal = new GregorianCalendar();
	

	private String name;
	private String techProblem;
	/**
	 * @param name
	 * @param date
	 * @param time
	 * @param techProblem
	 */
	public ITSupportRequests(String name, String techProblem) {
		super();
		this.name = name;
		this.techProblem = techProblem;
	}
	public String getName() {
		return name;
	}
	public String getTechProblem() {
		return techProblem;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTechProblem(String techProblem) {
		this.techProblem = techProblem;
	}
	@Override
	public String toString() {
		return "ITSupportRequests [name = " + name + ", techProblem = " + techProblem + "]";
	}
	
	public void printInfo() {
		System.out.println("Name: " + getName());
		System.out.println("Tech Problem: " + getTechProblem());
	}
	
	
	
	
	
	
	
}
