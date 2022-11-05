package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countAtest {

	@Test
	void test() {
		JunitTesting test=new JunitTesting();
		int output=test.count("SmithDsouza");
		assertEquals(2,output);
	}

}
