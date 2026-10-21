import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Car> availableCars;

    public InventoryManager() {
        availableCars = new ArrayList<>();
    }

    public void addCar(Car newCar) {
        availableCars.add(newCar);
    }

    public void removeCar(Car soldCar) {
        availableCars.remove(soldCar);
    }

    public List<Car> getAvailableCars() {
        return availableCars;
    }
}

