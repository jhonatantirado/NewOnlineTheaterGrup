package dycs.Customer.domain.repository;

import java.util.List;

import dycs.Customer.domain.entity.BankAccount;

public interface BankAccountBatchRepository {
	public void createBatch(List<BankAccount> bankAccountList);
}
