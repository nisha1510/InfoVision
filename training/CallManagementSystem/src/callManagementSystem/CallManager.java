package callManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CallManager {
	private static final CallManager instance = new CallManager();
	private final Map<String, List<CallLog>> callLogs = new HashMap<>();

	private CallManager() {
	}

	public static CallManager getInstance() {
		return instance;
	}

	public void simulateCall(String callerId, String receiverId, int durationSeconds) {
		CallLog log = new CallLog(callerId, receiverId);
		callLogs.computeIfAbsent(callerId, k -> new ArrayList<>()).add(log);

		new Thread(() -> {
			try {
				Thread.sleep(durationSeconds * 1000L);
			} catch (InterruptedException ignored) {
			}
			log.endCall();
			System.out.println("Call ended: " + callerId + " → " + receiverId);
		}).start();
	}

	public List<CallLog> getLogs(String customerId) {
		return callLogs.getOrDefault(customerId, Collections.emptyList());
	}
}
