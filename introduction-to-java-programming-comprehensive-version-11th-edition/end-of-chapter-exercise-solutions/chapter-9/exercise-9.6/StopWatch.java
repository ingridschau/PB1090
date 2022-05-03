
public class StopWatch {
	private long startTime; 
	private long endTime;	

	// no-arg constructor that initializes 
	// startTime with the current time
	StopWatch() {
		startTime = System.currentTimeMillis();
	}

	// Resets the startTime to the current time
	public void start() {
		startTime = System.currentTimeMillis();
	} 

	// Sets the endTime to the current time
	public void stop() {
		endTime = System.currentTimeMillis();
	}

	// Returns the elapsed time for 
	// the stopwatch in milliseconds
	public long getElapsedTime() {
		return getEndTime() - getStartTime();
	}

	// Return start time
	public long getStartTime() {
		return startTime;
	}

	// Return end time
	public long getEndTime() {
		return endTime;
	}
}