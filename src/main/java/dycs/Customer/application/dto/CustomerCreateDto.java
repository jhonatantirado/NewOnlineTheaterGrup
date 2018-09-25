package dycs.Customer.application.dto;

import java.util.Date;

public class CustomerCreateDto {
	
	private long CustomerID;
	private String  Name;
	private String Email;
	private int Status;
	private Date StatusExpirationDate;
	private Double MoneySpent;
	
	
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
