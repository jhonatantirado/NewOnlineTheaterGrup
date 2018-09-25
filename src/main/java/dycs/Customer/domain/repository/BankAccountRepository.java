package dycs.Customer.domain.repository;

import java.sql.SQLException;

import dycs.Customer.domain.entity.BankAccount;

//Separated Interface Pattern
//https://www.martinfowler.com/eaaCatalog/separatedInterface.html
public interface BankAccountRepository {
	public void create(BankAccount bankAccount) throws SQLException;
	public void delete(BankAccount bankAccount) throws SQLException; 
	public BankAccount read(long id) throws SQLException;
}
