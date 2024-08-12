package Employee;

public class HRDepartment implements DepartmentObserver { 
	  @Override
	    public void update(Employe employee, String message) {
		  System.out.println("HR Department Updated!");
	    }
}
