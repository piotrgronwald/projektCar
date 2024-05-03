import java.util.ArrayList;
import java.util.List;

public class Mechanic {
    private List<Car> repairedCars;
    private String name;

    public Mechanic(String name) {
        this.name = name;
        this.repairedCars = new ArrayList<>();
    }

    public void repairCar(Car car) {
        repairedCars.add(car);
        System.out.println("Samochód naprawiony przez mechanika " + name);
    }

    public boolean wasRepaired(Car car) {
        return repairedCars.contains(car);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getRepairedCars() {
        return repairedCars;
    }

    public void setRepairedCars(List<Car> repairedCars) {
        this.repairedCars = repairedCars;
    }
}
