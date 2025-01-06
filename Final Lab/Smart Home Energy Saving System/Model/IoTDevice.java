public class IoTDevice {
    private String deviceType;
    private String status;

    public IoTDevice(String deviceType, String status) {
        this.deviceType = deviceType;
        this.status = status;
    }

    public String sendData() {
        return "Data from " + deviceType;
    }

    public String executeCommand(String command) {
        this.status = command;
        return "Executed " + command + " on " + deviceType;
    }

    // Getters and Setters
    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}