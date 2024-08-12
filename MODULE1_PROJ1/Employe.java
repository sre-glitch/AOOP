package Employee;

public class Employe {
	  private String name;
	    private double salary;

	    public Employe(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + '}';
	    }
}
