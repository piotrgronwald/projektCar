public class Testing {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("BMW", "X5", 2019);
        Car car3 = new Car("Audi", "A4", 2018);

        CarRegister carRegister = new CarRegister();
        carRegister.addCar("ABC123", car1);
        carRegister.addCar("XYZ789", car2);
        carRegister.addCar("DEF456", car3);

        Mechanic mechanic = new Mechanic("John");

        mechanic.repairCar(car1);
        mechanic.repairCar(car2);

        System.out.println("Czy unikalne VINy:");
        System.out.println("Car1: " + car1.getVin());
        System.out.println("Car2: " + car2.getVin());
        System.out.println("Car3: " + car3.getVin());

        System.out.println("\nCzy unikalne numery rejestracyjne:");
        System.out.println("Car1: " + car1.getLicensePlate());
        System.out.println("Car2: " + car2.getLicensePlate());
        System.out.println("Car3: " + car3.getLicensePlate());

        System.out.println("\nLista naprawionych samochodów przez mechanika " + mechanic.getName() + ":");
        for (Car car : mechanic.getRepairedCars()) {
            System.out.println(car.getMaker() + " " + car.getModel());
        }

        System.out.println("\nCzy samochód car1 był naprawiany przez mechanika " + mechanic.getName() + "? " + mechanic.wasRepaired(car1));
        System.out.println("Czy samochód car3 był naprawiany przez mechanika " + mechanic.getName() + "? " + mechanic.wasRepaired(car3));
    }
}
