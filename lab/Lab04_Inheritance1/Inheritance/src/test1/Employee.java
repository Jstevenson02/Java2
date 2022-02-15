package test1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 abstract public class Employee
{ 
    private String name;
    public Employee(){name="no name";}
    public Employee(String name){this.name = name;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    @Override
    public String toString()
    {
        return "Employee{" + "name=" + name + '}';
    }
    abstract public double computePay();
}
