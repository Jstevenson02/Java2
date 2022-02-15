package src;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}

	
	/** 
	 * @param newId
	 */
	public void setId(int newId) {
		id = newId;
	}

	
	/** 
	 * @param newBalance
	 */
	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	
	/** 
	 * @param newAnnualInterestRate
	 */
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}

	
	/** 
	 * @return int
	 */
	public int getId() {
		return id;
	}

	
	/** 
	 * @return double
	 */
	public double getBalance() {
		return balance;
	}

	
	/** 
	 * @return double
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	
	/** 
	 * @return String
	 */
	public String getDateCreated() {
		return dateCreated.toString();
	}

	
	/** 
	 * @return double
	 */
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	
	/** 
	 * @return double
	 */
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	
	/** 
	 * @param amount
	 */
	public void withdraw(double amount) {
		balance -= amount;
	}

	
	/** 
	 * @param amount
	 */
	public void deposit(double amount) {
		balance += amount;
	}
}