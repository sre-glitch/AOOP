package five1;

public class WageCalculatorDemo {
    public static void main(String[] args) {
        WorkerInfo worker = new WorkerInfo("Sreya", "Engineer");
        WageCalculator wageCalculator = new WageCalculator();
        double wage = wageCalculator.computeWage(worker);
        System.out.println("Computed wage: " + wage);
    }
}
