import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class EmployeeClass {
    char[] name;
    int salary;
    Date hireDate;

    public EmployeeClass() {
    }

    public EmployeeClass(char[] name, int salary, Date hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public char[] getName() {
        return this.name;
    }

    public void setName(char[] name) {
        this.name = name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public EmployeeClass name(char[] name) {
        setName(name);
        return this;
    }

    public EmployeeClass salary(int salary) {
        setSalary(salary);
        return this;
    }

    public EmployeeClass hireDate(Date hireDate) {
        setHireDate(hireDate);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EmployeeClass)) {
            return false;
        }
        EmployeeClass employeeClass = (EmployeeClass) o;
        return Objects.equals(name, employeeClass.name) && salary == employeeClass.salary
                && Objects.equals(hireDate, employeeClass.hireDate);
    }

    @Override
    public String toString() {
        String nameString = "";
        for (char c : name) {
            nameString += c;

        }
        return "{" +
                " name='" + nameString + "'" +
                ", salary='" + getSalary() + "'" +
                ", hireDate='" + getHireDate() + "'" +
                "}";
    }

    public static void printArray(EmployeeClass[] ar) {
        for (EmployeeClass employee : ar) {
            System.out.println(employee);
        }
    }

    public static List<Integer> sortArray(EmployeeClass[] ar) {
        List<Integer> sortedArray = new ArrayList<Integer>();

        for (EmployeeClass employeeClass : ar) {
            sortedArray.add(employeeClass.salary);
        }
        
        Collections.sort(sortedArray);

        return sortedArray;
    }

    public static void main(String[] args) {

        EmployeeClass[] ar = {
                new EmployeeClass("John Doe".toCharArray(), 5000000, new Date()),
                new EmployeeClass("Athanasios Markou".toCharArray(), 125000000, new Date()),
                new EmployeeClass("Jacob Stevenson".toCharArray(), 425000, new Date()),
        };
        System.out.println(sortArray(ar));
        System.out.println();
        printArray(ar);
    }
}