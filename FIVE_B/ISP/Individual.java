package five4;

public class Individual implements TaskHandler, MealTaker {
    @Override
    public void handleTask() {
        System.out.println("Individual is handling the task.");
    }

    @Override
    public void takeMeal() {
        System.out.println("Individual is taking a meal.");
    }
}
