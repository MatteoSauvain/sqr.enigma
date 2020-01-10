package enigma;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;

public class RotorTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testRotorFactory1Notch(){
		Rotor r = new Rotor();
		String notch1 = "Q";
		String str = "E K M F L G D Q V Z N T O W Y H X U S P A I B R C J";
		char[] s = str.trim().replace(" ", "").toCharArray();
		char[] expectedCharArray = {'E','K','M','F','L','G','D','Q','V','Z','N','T','O','W','Y','H','X','U','S','P','A','I','B','R','C','J'};
		assertEquals(Arrays.toString(s), Arrays.toString(expectedCharArray));

		int[] cipher = new int [26];
		for (int i = 0; i< 26; i++){
			cipher[i] = Rotor.toIndex(s[i]);
		}
		s = notch1.trim().replace(" and ", "").toCharArray();
		char[] expectedChar = {'Q'};
		assertEquals(Arrays.toString(s), Arrays.toString(expectedChar));
		int positionNotch1 = Rotor.toIndex((s[0]));
		//Ascii code of Q - Ascii code of A
		int expectedAsciiNumber = 81-65;
		assertEquals(positionNotch1, expectedAsciiNumber);



	}

	@Test
	public void testRotorFactory2Notch(){
		Rotor r = new Rotor();
		String notch2 = "Z and M ";
		String str = "E K M F L G D Q V Z N T O W Y H X U S P A I B R C J";
		char[] s = str.trim().replace(" ", "").toCharArray();
		char[] expectedCharArray = {'E','K','M','F','L','G','D','Q','V','Z','N','T','O','W','Y','H','X','U','S','P','A','I','B','R','C','J'};
		assertEquals(Arrays.toString(s), Arrays.toString(expectedCharArray));

		int[] cipher = new int [26];
		for (int i = 0; i< 26; i++){
			cipher[i] = Rotor.toIndex(s[i]);
		}
		s = notch2.trim().replace(" and ", "").toCharArray();
		char[] expectedChar = {'Z','M'};
		assertEquals(Arrays.toString(s), Arrays.toString(expectedChar));
		int positionNotch1 = Rotor.toIndex((s[0]));
		int positionNotch2 = Rotor.toIndex((s[1]));
		//Ascii code of Z - Ascii code of A
		int expectedAsciiNumber1 = 90-65;
		//Ascii code of M - Ascii code of A
		int expectedAsciiNumber2 = 77-65;
		assertEquals(expectedAsciiNumber1, positionNotch1);
		assertEquals(expectedAsciiNumber2, positionNotch2);

	}

}
