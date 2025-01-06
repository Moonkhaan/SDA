import java.util.HashMap;
import java.util.Map;

public class CloudData {
    private Map<String, String> dataStore;

    public CloudData() {
        this.dataStore = new HashMap<>();
    }

    public String receiveData(String deviceId, String data) {
        dataStore.put(deviceId, data);
        return "Data stored in cloud";
    }

    public String sendData(String deviceId) {
        return dataStore.getOrDefault(deviceId, "No data found");
    }
}