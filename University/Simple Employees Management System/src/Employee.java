public class Employee implements Comparable<Employee>{
    String firstName, lastName;
    EmployeeCondition employeeCon;
    int yearBirth;
    double salary;

    public void printing() {
        System.out.println("Name: "+firstName+" "+lastName);
        System.out.println("Year of birth: "+yearBirth);
        System.out.println("Employee state: "+employeeCon);
        System.out.println("Salary: "+salary);
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }

    Employee(String firstName, String lastName, int yearBirth, EmployeeCondition employeeCon, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearBirth = yearBirth;
        this.employeeCon = employeeCon;
        this.salary = salary;
    }
    public String getName() {
        return firstName;
    }

    public double getWynagrodzenie() {
        return salary;
    }
    public String getlastName() {
        return lastName;
    }
}
