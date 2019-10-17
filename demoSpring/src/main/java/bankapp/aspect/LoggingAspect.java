package bankapp.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(* *.transferAmount(..))")
	public void logBeforTransfer() {
		System.out.println("Before transfering: xxx ");
	}
	
	@After("execution(* *.transferAmount(..))")
	public void logAfterTransfer() {
		System.out.println("After transfering: xxx ");
	}

}
