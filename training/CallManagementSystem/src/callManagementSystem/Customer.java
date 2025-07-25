package callManagementSystem;

public class Customer {
	
	private final String id;
	private String name;
	private Plan plan;
	 
	public Customer(String id, String name, Plan plan) {
		super();
		this.id = id;
		this.name = name;
		this.plan = plan;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Plan getPlan() {
		return plan;
	}
	
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	
	public String getId() {
		return id;
	}
}
