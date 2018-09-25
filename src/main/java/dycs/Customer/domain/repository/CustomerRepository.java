package dycs.Customer.domain.repository;

import java.sql.SQLException;

import dycs.Customer.domain.entity.BankAccount;
import dycs.Customer.domain.entity.Customer;

public interface CustomerRepository {
	public void create(Customer customer) throws SQLException ;
	public void delete(Customer customer) throws SQLException;
	public Customer read(long id) throws SQLException;

}
