import java.util.List;
import java.util.ArrayList;

public class AIRecommendationEngine {
    public List<Car> calculateTopMatches(List<Car> inventory, double targetBudget) {
        List<Car> recommendations = new ArrayList<>();
        
        for (Car currentCar : inventory) {
            if (currentCar.getPrice() <= targetBudget) {
                recommendations.add(currentCar);
            }
        }
        
        return recommendations;
    }
}


