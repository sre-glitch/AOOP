package Employee;

public class Mainn {
	 public static void main(String[] args) {
	        // Get the single instance of EmployeeManager
	        EmployeeManager manager = EmployeeManager.getInstance();

	        // Create departments
	        HRDepartment hr = new HRDepartment();
	        FinanceDepartment finance = new FinanceDepartment();

	        // Register observers
	        manager.addObserver(hr);
	        manager.addObserver(finance);

	        // Create employees
	        Employe emp1 = new Employe("John Doe", 50000);
	        Employe emp2 = new Employe("Jane Smith", 60000);

	        // Manage employees (add, update, remove)
	        manager.addEmployee(emp1);
	        manager.addEmployee(emp2);
	        manager.updateEmployeeSalary(emp1, 55000);
	        manager.removeEmployee(emp2);
	   
	    }
}
