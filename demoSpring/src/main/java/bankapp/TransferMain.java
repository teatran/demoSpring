package bankapp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bankapp.config.AppConfig;
import bankapp.domain.Amount;
import bankapp.service.TransferService;

public class TransferMain {
	
	public static void main(String[] args) {
		
		// load Spring context
		ConfigurableApplicationContext appContext =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		// get TransferService bean
		TransferService transferService = appContext.getBean(TransferService.class);
		
		// use method in the bean
		transferService.transferAmount(100L, 202L, new Amount(9999.99));
		
		appContext.close();
	}
}
