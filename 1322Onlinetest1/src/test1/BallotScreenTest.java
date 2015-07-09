package test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BallotScreenTest {
BallotScreen bs=new BallotScreen();
	@Test
	public void testAddCandidate() {
		assertEquals(true,bs.addCandidate("wilber", true));
	}

}
