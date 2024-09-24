//Without protected variation principle
class Sedan {
    public String drive() {
        return "Driving a Sedan.";
    }
}

class SUV {
    public String drive() {
        return "Driving an SUV.";
    }
}

class Truck {
    public String drive() {
        return "Driving a Truck.";
    }
}

class CarRentalService {
    private String carType;

    public CarRentalService(String carType) {
        this.carType = carType;
    }

    public String rentCar() {
        if (carType.equals("Sedan")) {
            Sedan sedan = new Sedan();
            return sedan.drive();
        } else if (carType.equals("SUV")) {
            SUV suv = new SUV();
            return suv.drive();
        } else if (carType.equals("Truck")) {
            Truck truck = new Truck();
            return truck.drive();
        } else {
            return "Car type not recognized.";
        }
    }
}

 class CarRentalApp {
    public static void main(String[] args) {
        CarRentalService sedanRental = new CarRentalService("Sedan");
        String sedanOutput = sedanRental.rentCar(); 

        CarRentalService suvRental = new CarRentalService("SUV");
        String suvOutput = suvRental.rentCar(); 

        CarRentalService truckRental = new CarRentalService("Truck");
        String truckOutput = truckRental.rentCar();  

        System.out.println(sedanOutput);
        System.out.println(suvOutput);
        System.out.println(truckOutput);
    }
}
