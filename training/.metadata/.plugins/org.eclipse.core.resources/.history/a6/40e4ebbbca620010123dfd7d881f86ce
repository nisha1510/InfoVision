package callManagementSystem;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CustomerService {
	
	private final Map<String, Customer> customers = new HashMap<>();
	
	public void addCustomer(String id, String name, String planType) {
		Plan plan = PlanFactory.createPlan(planType);
		customers.put(id, new Customer(id, name, plan));
	}
	
	public Customer getCustomer(String id) {
		return customers.get(id);
	}
	
	public Collection<Customer> getAllCustomers(){
		return customers.values();
	}
}
