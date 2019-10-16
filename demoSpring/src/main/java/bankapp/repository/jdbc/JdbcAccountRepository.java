package bankapp.repository.jdbc;

import bankapp.domain.Account;
import bankapp.domain.Amount;
import bankapp.repository.AccountRepository;

public class JdbcAccountRepository implements AccountRepository {

	@Override
	public Account findById(Long accountId) {
		
		return new Account(accountId, "Arnav Rajput", new Amount(3000.0));
	}

}
