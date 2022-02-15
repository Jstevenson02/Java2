
package test1;
public class SalaryEmployee extends Employee
{
    private double salary;

    public SalaryEmployee( String name, double salary)
    {
        super(name);
        this.salary = salary;
    } 
    public double getSalary(){return salary;}
    public void setSalary(double salary){this.salary = salary;}
    @Override public double computePay(){return this.salary / 52;}

    @Override public String toString(){
        String s = super.toString();
        return s + "\nSalaryEmployee{" + "salary=" + salary + '}';
    }
    
}
