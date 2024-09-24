abstract class Car {
    public abstract String drive();
}
class Sedan extends Car {
    @Override
    public String drive() {
        return "Driving a Sedan.";
    }
}

class SUV extends Car {
    @Override
    public String drive() {
        return "Driving an SUV.";
    }
}
class Truck extends Car {
    @Override
    public String drive() {
        return "Driving a Truck.";
    }
}
class CarRentalService {
    private Car car;

    public CarRentalService(Car car) {
        this.car = car;
    }

    public String rentCar() {
        return car.drive();
    }
}

public class CarRentalApp {
    public static void main(String[] args) {
        CarRentalService sedanRental = new CarRentalService(new Sedan());
        String sedanOutput = sedanRental.rentCar();  // Output: Driving a Sedan.

        CarRentalService suvRental = new CarRentalService(new SUV());
        String suvOutput = suvRental.rentCar();  // Output: Driving an SUV.
        CarRentalService truckRental = new CarRentalService(new Truck());
        String truckOutput = truckRental.rentCar();  // Output: Driving a Truck.
        System.out.println(sedanOutput);
        System.out.println(suvOutput);
        System.out.println(truckOutput);
    }
}


