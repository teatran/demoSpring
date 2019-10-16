package bankapp.service;

import bankapp.domain.Account;
import bankapp.domain.Amount;
import bankapp.repository.AccountRepository;
import bankapp.repository.TransferRepository;

public class TransferServiceImpl implements TransferService {

	AccountRepository accountRepository;
	TransferRepository transferRepository;
	
	public TransferServiceImpl(AccountRepository accountRepository, TransferRepository transferRepository) {
		this.accountRepository = accountRepository;
		this.transferRepository = transferRepository;
	}

	@Override
	public void transferAmmount(Long a, Long b, Amount amount) {
		Account accountA = accountRepository.findById(a);
		Account accountB = accountRepository.findById(b);
		transferRepository.transfer(accountA, accountB, amount);
	}
	
	
}
