
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IoTController controller = new IoTController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Smart Home Energy Saving System Created By Muneeb Khan!");
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add IoT Device");
            System.out.println("2. Send Data to the Cloud");
            System.out.println("3. Fetch Data from Cloud");
            System.out.println("4. View User Devices");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Device Type: ");
                    String deviceType = scanner.nextLine();
                    System.out.print("Enter Initial Status: ");
                    String status = scanner.nextLine();
                    System.out.println(controller.addDevice(deviceType, status));
                    break;
                case 2:
                    System.out.print("Enter Device ID: ");
                    String deviceId = scanner.nextLine();
                    System.out.print("Enter Data to Send: ");
                    String data = scanner.nextLine();
                    System.out.println(controller.sendDataToCloud(deviceId, data));
                    break;
                case 3:
                    System.out.print("Enter Device ID: ");
                    deviceId = scanner.nextLine();
                    System.out.println(controller.fetchDataFromCloud(deviceId));
                    break;
                case 4:
                    System.out.println("User Devices:");
                    for (IoTDevice device : controller.getUserDevices()) {
                        System.out.println(" - " + device.getDeviceType() + " (Status: " + device.getStatus() + ")");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

