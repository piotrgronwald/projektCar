import java.util.HashSet;
import java.util.Set;

public class Car {
    private String maker;
    private String model;
    private int productionYear;
    private String vin;

    private static Set<String> globalVins = new HashSet<>();
    private String licensePlate;

    public Car(String maker, String model, int productionYear) {
        this.maker = maker;
        this.model = model;
        this.productionYear = productionYear;
        generateUniqueVin();
    }

    private void generateUniqueVin() {
        do {
            this.vin = VinGenerator.generateVin();
        } while (globalVins.contains(this.vin));
        globalVins.add(this.vin);
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
