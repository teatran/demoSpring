package bankapp.repository;

import bankapp.domain.Account;

public interface AccountRepository {
	
	Account findById(Long accountId);
	
}
