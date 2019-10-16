package bankapp.service;

import bankapp.domain.Amount;

public interface TransferService {
	
	void transferAmmount(Long a, Long b, Amount amount);

}
