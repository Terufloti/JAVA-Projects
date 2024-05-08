public class Main {
    public static void main(String[] args) {
        ClassContainer kontener = new ClassContainer();
        kontener.addClass("Kolchoz", 10);
        kontener.addClass("Kiero", 3);
        Employee Kacper = new Employee("Kacper", "Kowalski", 1990, EmployeeCondition.PRESENT, 3000);
        ClassEmployee klasaKiero = kontener.classMap.get("Kiero");
        klasaKiero.addEmployee(Kacper);
        ClassEmployee klasaWhatever = new ClassEmployee("Whatever", 15);
        kontener.classMap.put("Whatever", klasaWhatever);
        kontener.summary();
        klasaKiero.search("Kowalski");
        System.out.println("------------");
        Employee Tomek = new Employee("Tomek", "Kowalski", 2000, EmployeeCondition.PRESENT, 2000);
        klasaKiero.addEmployee(Tomek);
        klasaKiero.summary();
        System.out.println("");
        klasaKiero.sortByName();
        klasaKiero.summary();
        System.out.println("==========");
        klasaKiero.sortBySalary();
        System.out.println("==========");
        klasaKiero.summary();
        klasaKiero.max();
        System.out.println("Present employees in class Kiero: "+klasaKiero.countByCondition(EmployeeCondition.PRESENT));
        klasaKiero.searchPartial("Kow");
        System.out.println("++++++++++++++");
        klasaKiero.summary();
        Employee Pawel = new Employee("Pawel", "Świr",2002, EmployeeCondition.PRESENT, 2500);
        klasaKiero.addEmployee(Pawel);
        klasaKiero.sortBySalary();
        System.out.println("");
        klasaKiero.summary();
        System.out.println("++++++++++++++");
        kontener.summary();
        
    }
}