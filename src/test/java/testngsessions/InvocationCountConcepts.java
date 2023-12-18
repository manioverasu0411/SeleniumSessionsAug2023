package testngsessions;

import org.testng.annotations.Test;

public class InvocationCountConcepts {

	@Test(invocationCount = 10)
	public void searchProdcutTest() {
		System.out.println("Login Test");
	}
	
}
