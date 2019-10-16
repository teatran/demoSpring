package bankapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bankapp.repository.AccountRepository;
import bankapp.repository.TransferRepository;
import bankapp.repository.jdbc.JdbcAccountRepository;
import bankapp.repository.jdbc.JdbcTransferRepository;
import bankapp.service.TransferService;
import bankapp.service.TransferServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean
	public AccountRepository accountRepository() {
		return new JdbcAccountRepository();
	}
	
	@Bean
	public TransferRepository transferRepository() {
		return new JdbcTransferRepository();
	}
	
	@Bean
	public TransferService transferService() {
		return new TransferServiceImpl(accountRepository(), transferRepository());
	}
}
