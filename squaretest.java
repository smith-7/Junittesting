package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squaretest {

	@Test
	void test() {
		JunitTesting test=new JunitTesting();
		int output=test.square(5);
		assertEquals(26,output);
	}
	}


