import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ClassEmployee {
    String classEmployeeName;
    ArrayList<Employee> employeeList = new ArrayList<>();
    int maxEmployees;

    void addEmployee(Employee employee) {
        if(employeeList.size()<maxEmployees) {
            this.employeeList.add(employee);
        } else {
            System.out.println("This employee class is full. Try to remove some positions and try again.");
        }
    }

    void addSalary(Employee employee, double salary) {
        if(salary >= 0) {
            employee.salary += salary;
        } else {
            System.out.println("Command is for ADDING to salary, not subtracting.");
        }
    }

    void removeEmployee(Employee employee) {
        if(employeeList.contains(employee) == true) {
            employeeList.remove(employee);
            System.out.println("Employee with following data has been removed: ");
            employee.printing();
        }
    }

    void changeCondition(Employee employee, EmployeeCondition employeeCondition) {
        if(employee.employeeCon != employeeCondition) {
            employee.employeeCon = employeeCondition;
            System.out.println("Employee condition has been changed.");
        } else {
            System.out.println("Employee condition is identical to the one given.");
        }
    }
    
    void search(String lastName){
        boolean istnienie = false;
        Comparator<Employee> compareBySurname = Comparator.comparing(Employee::getlastName);
        employeeList.sort(compareBySurname);
        for(Employee employee : employeeList) {
            if(employee.getlastName().equals(lastName)) {
                istnienie = true;
                employee.printing();
            }
        }
        if(istnienie == false) {
            System.out.println("Employee with last name: "+lastName+" does not exist in this class.");
        }
    }

    void searchPartial(String fragment) {
        for(Employee employee : employeeList) {
            if(employee.getlastName().contains(fragment) || employee.firstName.contains(fragment)){
                employee.printing();
            }
        }
    }

    int countByCondition(EmployeeCondition employeeCondition) {
        int counter = 0;
        for(Employee employee : employeeList) {
            if(employee.employeeCon == employeeCondition) {
                counter++;
            }
        }
        return counter;
    }

    void summary(){
        for(Employee employee : employeeList) {
            employee.printing();
        }
    }

    void sortByName(){
        Comparator<Employee> compareByName = Comparator.comparing(Employee::getName);
        employeeList.sort(compareByName);
    }

    void sortBySalary() {
        Comparator<Employee> compareBySalary = Comparator.comparing(Employee::getWynagrodzenie);
        employeeList.sort(compareBySalary);
    }

    void max() {
        Comparator<Employee> compareBySalary = Comparator.comparing(Employee::getWynagrodzenie);
        Employee maxSalaryEmployee = Collections.max(employeeList, compareBySalary);
        System.out.println("Highest salary in this class ("+classEmployeeName+") is: "+ maxSalaryEmployee.getWynagrodzenie());
    }


    ClassEmployee(String classEmployeeName, int maxEmployees) {
        this.maxEmployees = maxEmployees;
        this.classEmployeeName = classEmployeeName;
        employeeList = new ArrayList<>(maxEmployees);
    }
}
