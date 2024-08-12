package Employee;

public class FinanceDepartment implements DepartmentObserver{
	 @Override
	    public void update(Employe employee, String message) {
		 System.out.println("Finance of the employee Updated!");
	    }
}
