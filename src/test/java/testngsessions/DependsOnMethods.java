package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void loginTest() {
		System.out.println("Login Test");
		int i = 9 / 0;

	}

	@Test(dependsOnMethods = "loginTest")
	public void searchTest() {
		System.out.println("Search Test");

	}

	@Test(dependsOnMethods = "searchTest")
	public void addToCart() {
		System.out.println("add to Cart Test");

	}

}
