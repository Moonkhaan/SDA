import java.util.List;

public class IoTController {
    private CloudData cloudData;
    private User user;

    public IoTController() {
        this.cloudData = new CloudData();
        this.user = new User("MuneebKhan", "muneeb@example.com");
    }

    public String addDevice(String deviceType, String status) {
        IoTDevice device = new IoTDevice(deviceType, status);
        return user.addDevice(device);
    }

    public String sendDataToCloud(String deviceId, String data) {
        return cloudData.receiveData(deviceId, data);
    }

    public String fetchDataFromCloud(String deviceId) {
        return cloudData.sendData(deviceId);
    }

    public List<IoTDevice> getUserDevices() {
        return user.getDevices();
    }
}

