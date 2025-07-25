package callManagementSystem;

public class PlanFactory {
	
	public static Plan createPlan(String type) {
		
		switch(type.toLowerCase()) {
		
		case "prepaid" : 
			return new PrepaidPlan();
		
		case "postpaid" : 
			return new PostpaidPlan();
			
		default : 
			throw new IllegalArgumentException("Invalid Plan Type");
		}
	}
}
