package test1;

/**
 *
 * @author ASDV2
 */
public class TestClass
{
    public static void main(String[] args)
    {
        WageEmployee w1 = new WageEmployee( "John Wayne", 12.50, 40);
        System.out.println(w1);
        System.out.println(w1.getName() + " earns weekly: "  + w1.computePay());
    
        SalaryEmployee e1 = new SalaryEmployee( "Al Pacino", 100000);
        System.out.println(w1);
        System.out.println(e1.getName() + " earns weekly: "  + e1.computePay());
        //Employee e2 = new Employee();

    }
}
