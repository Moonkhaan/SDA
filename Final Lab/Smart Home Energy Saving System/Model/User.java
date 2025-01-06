import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private List<IoTDevice> devices;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.devices = new ArrayList<>();
    }

    public String addDevice(IoTDevice device) {
        devices.add(device);
        return device.getDeviceType() + " added to user " + username;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<IoTDevice> getDevices() {
        return devices;
    }
}