package PracticeSet3;

import java.sql.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	public Account(){
		
	}
	public Account(int i, double b){
		id = i;
		balance = b;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getMonthlyInterestRate(){
		return (annualInterestRate/12.0);
	}
	public void withdraw(double x) throws InsufficientFundsException{
		if(x>balance){
			throw new InsufficientFundsException();
		}
		balance = balance - x;
	}
	public void deposit(double y){
		balance+=y;
	}
	public void setDate(Date d){
		dateCreated = d;
	}
	public Date getDate(){
		return this.dateCreated;
	}
	public void setDate(int i, int j) {
	}
}
