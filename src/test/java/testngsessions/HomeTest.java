package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest {

	public int sum(int a, int b) {
		return a + b;
	}

	@Test
	public void test1() {
		Assert.assertEquals(sum(10, 20), 30);

	}
	
	@Test
	public void test2() {
		Assert.assertEquals(sum(-10, 20), 10);

	}

	@Test
	public void test3() {
		Assert.assertEquals(sum(-10, -20), 30);
	}

}
