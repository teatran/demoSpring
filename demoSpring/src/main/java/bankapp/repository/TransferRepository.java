package bankapp.repository;

import bankapp.domain.Account;
import bankapp.domain.Amount;

public interface TransferRepository {
	
	void transfer(Account accountA, Account accountB, Amount amount);

}
