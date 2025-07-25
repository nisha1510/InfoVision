package callManagementSystem;

import java.util.List;

public class TelecomApp {
	
	public static void main(String[] args) throws InterruptedException {
	
		CustomerService customerService = new CustomerService();
		customerService.addCustomer("C1", "Alice", "Postpaid");
		customerService.addCustomer("C2", "Bob", "Prepaid");

		CallManager callManager = CallManager.getInstance();
		callManager.simulateCall("C1", "C2", 5); // 5 seconds call

		Thread.sleep(6000); // Wait for call to finish

		List<CallLog> logs = callManager.getLogs("C1");
		double bill = BillingEngine.getInstance().generateBill(customerService.getCustomer("C1"), logs);

		System.out.println("Bill for Alice: ₹" + bill);
	}
}
