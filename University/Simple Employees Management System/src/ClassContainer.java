import java.util.HashMap;
import java.util.Map;

public class ClassContainer {
    Map<String, ClassEmployee> classMap;

    void addClass(String employeeClassName, int maxEmployees) {
        if(classMap.containsKey(employeeClassName) == false) {
            ClassEmployee classEmployee = new ClassEmployee(employeeClassName, maxEmployees);
            classMap.put(employeeClassName, classEmployee);
        } else {
            System.out.println("Class with given name already exists.");
        }
    }

    void removeClass(String employeeClassName) {
        if(classMap.containsKey(employeeClassName) == true) {
            classMap.remove(employeeClassName);
        } else {
            System.out.println("Class with given name does not exist.");
        }
    }

    void findEmpty() {
        for(Map.Entry<String, ClassEmployee> entry : classMap.entrySet()) {
            if(entry.getValue().employeeList.size() == 0) {
                System.out.println("Class "+entry.getKey()+" is empty.");
            }
        }
    }

    void summary() {
        for(Map.Entry<String, ClassEmployee> entry : classMap.entrySet()) {
            double filledPercentage = (double) entry.getValue().employeeList.size() /entry.getValue().maxEmployees;
            filledPercentage = filledPercentage * 100;
            System.out.println("Class "+entry.getKey()+" is "+filledPercentage+"% full"+" ("+
                    entry.getValue().employeeList.size()+"/"+entry.getValue().maxEmployees+")");
        }
    }

    ClassContainer() {
        classMap = new HashMap<>();
    }
}
