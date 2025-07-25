package callManagementSystem;

public class CallLog {
	
	private final String callerId;
    private final String receiverId;
    private final long startTime;
    private long endTime;
    
    public CallLog(String callerId, String receiverId) {
        this.callerId = callerId;
        this.receiverId = receiverId;
        this.startTime = System.currentTimeMillis();
    }

    public void endCall() {
        this.endTime = System.currentTimeMillis();
    }

    public long getDurationInMinutes() {
        return Math.max(1, (endTime - startTime) / 60000);
    }

	public long getEndTime() {
		return endTime;
	}

//	public void setEndTime(long endTime) {
//		this.endTime = endTime;
//	}

	public String getCallerId() {
		return callerId;
	}

	public String getReceiverId() {
		return receiverId;
	}

	public long getStartTime() {
		return startTime;
	}
}
