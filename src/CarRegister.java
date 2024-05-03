import java.util.HashMap;
import java.util.Map;

public class CarRegister {
    private Map<String, Car> carRegistry = new HashMap<>();

    public void addCar(String licensePlate, Car car) {
        if (!carRegistry.containsKey(licensePlate)) {
            carRegistry.put(licensePlate, car);
            System.out.println("Dodano samochód o tablicach rejestracyjnych: " + licensePlate);
        } else {
            System.out.println("Tablica rejestracyjna już istnieje w rejestrze.");
        }
    }

    public Car getCarByLicensePlate(String licensePlate) {
        return carRegistry.get(licensePlate);
    }
}
