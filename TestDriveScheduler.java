import java.util.HashMap;
import java.util.Map;

public class TestDriveScheduler {
    private Map<String, String> schedule;

    public TestDriveScheduler() {
        schedule = new HashMap<>();
    }

    public void bookTestDrive(String customerName, String dateAndTime) {
        schedule.put(dateAndTime, customerName);
    }

    public boolean checkAvailability(String dateAndTime) {
        return !schedule.containsKey(dateAndTime);
    }
}

