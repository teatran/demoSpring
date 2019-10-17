package bankapp.service;

import bankapp.domain.Amount;

public interface TransferService {
	
	void transferAmount(Long a, Long b, Amount amount);

}
