/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author ASDV2
 */
public class WageEmployee extends Employee
{
    private double wage;   
    private double hours;
    public WageEmployee( String name, double wage, double hours)
    {
        super(name);
        this.wage = wage;
        this.hours = hours;
    }
    public double getHours(){return hours;}
    public void setHours(double hours){this.hours = hours;}
    public double getWage(){return wage;}
    public void setWage(double wage){this.wage = wage;}
 
    @Override public double computePay(){return this.hours * this.wage; }
    
    @Override public String toString()
    {
        String s = super.toString();
        return s + "\nWageEmployee{" + "wage=" + wage + ", hours=" + hours + '}';
    }
   
    
}
