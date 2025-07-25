package callManagementSystem;

import java.util.List;

public class BillingEngine {
	private static final BillingEngine instance = new BillingEngine();

    private BillingEngine() {}

    public static BillingEngine getInstance() {
        return instance;
    }
    
    public double generateBill(Customer customer, List<CallLog> logs) {
        double rate = customer.getPlan().getRatePerMinute();
        long totalMinutes = logs.stream().mapToLong(CallLog::getDurationInMinutes).sum();
        return totalMinutes * rate;
    }
}
