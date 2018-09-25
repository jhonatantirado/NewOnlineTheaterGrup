package dycs.customers.domain.entity;

import java.util.Date;
import java.util.Set;

import dycs.Customer.domain.entity.BankAccount;

public class Customer {
	private long CustomerID;
	private String  Name;
	private String Email;
	private int Status;
	private Date StatusExpirationDate;
	private Double MoneySpent;
	
		
	@Override
	public String toString() {
		return "Customer [CustomerID=" + CustomerID + ", Name=" + Name + ", Email=" + Email + ", Status=" + Status
				+ ", StatusExpirationDate=" + StatusExpirationDate + ", MoneySpent=" + MoneySpent + "]";
	}
	public Customer() {
		
	}
	public long getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(long customerID) {
		CustomerID = customerID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public Date getStatusExpirationDate() {
		return StatusExpirationDate;
	}
	public void setStatusExpirationDate(Date statusExpirationDate) {
		StatusExpirationDate = statusExpirationDate;
	}
	public Double getMoneySpent() {
		return MoneySpent;
	}
	public void setMoneySpent(Double moneySpent) {
		MoneySpent = moneySpent;
	}
	
	
}
