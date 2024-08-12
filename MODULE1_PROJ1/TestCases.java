package Employee;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCases {

    private EmployeeManager manager;
    private HRDepartment hr;
    private FinanceDepartment finance;
    private Employe employee;

    @Before
    public void setUp() {
        manager = EmployeeManager.getInstance();
        hr = new HRDepartment();
        finance = new FinanceDepartment();
        employee = new Employe("John Doe", 50000);
    }

    @Test
    public void testSingletonInstance() {
        EmployeeManager instance1 = EmployeeManager.getInstance();
        EmployeeManager instance2 = EmployeeManager.getInstance();
        assertSame("Both instances should be the same", instance1, instance2);
    }

    @Test
    public void testAddEmployeeNotification() {
        manager.addObserver(hr);
        manager.addObserver(finance);
        manager.addEmployee(employee);
        // Check if the console output includes "Observer notified" with the appropriate message
        // You may need to capture and check console output or modify the notification mechanism for testability
    }

    @Test
    public void testRemoveEmployeeNotification() {
        manager.addObserver(hr);
        manager.addObserver(finance);
        manager.removeEmployee(employee);
        // Check if the console output includes "Observer notified" with the appropriate message
        // You may need to capture and check console output or modify the notification mechanism for testability
    }

    @Test
    public void testUpdateEmployeeSalaryNotification() {
        manager.addObserver(hr);
        manager.addObserver(finance);
        manager.updateEmployeeSalary(employee, 60000);
        // Check if the console output includes "Observer notified" with the appropriate message
        // You may need to capture and check console output or modify the notification mechanism for testability
    }
}


