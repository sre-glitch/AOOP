package Employee;

public class EmployeeManager {
	private static EmployeeManager instance;

    // Private constructor to prevent instantiation
    private EmployeeManager() {}

    // Public method to provide access to the single instance
    public static EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager();
        }
        return instance;
    }

    // Methods to manage employees (add, remove, update)
    public void addEmployee(Employe employee) {
    	System.out.println("Employee added!");
    	}

    public void removeEmployee(Employe employee) {
    	System.out.println("Employee removed!");
    }
    public void updateEmployeeSalary(Employe employee, double newSalary) {
    	System.out.println("Employee salary updated!");
    }

    // Method to add observer
    public void addObserver(DepartmentObserver observer) {
    	System.out.println("Observer added!");
    }

    // Method to notify observers of employee changes
    private void notifyObservers(Employe employee) {
    	System.out.println("Observer notified, Employee: " +employee);
    }


}
