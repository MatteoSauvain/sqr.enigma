package enigma;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Main;

public class MachineTest {
	
	String config ="* B III IV I AXLE";
	String msg1 = "FROM his shoulder Hiawatha";
	String code1 = "HYIHBSBOEBTWJZSXMWQKYGWSFR";
	String msg2 = "HYIHLBKOMLIUYDCMPPSFSZW";
	String code2 = "FROMHISSHOULDERHIAWATHA";
	
	@Test
	public void convert_Msg1_code1() {
		Machine m = new Machine();
		Main.configure(m, config);
		String expected = code1;
		String actual = m.convert(msg1);
		assertEquals(expected, actual);
	}

	@Test
	public void unconvert_Msg2_code2() {
		Machine m = new Machine();
		Main.configure(m, config);
		String expected = code2;
		String actual = m.convert(msg2);
		assertEquals(expected, actual);
	}

	@Test
	public void areRotorsAdvanced(){
		Rotor r = new Rotor();
		String str = "E K M F L G D Q V Z N T O W Y H X U S P A I B R C J";
		char[] s = str.trim().replace(" ", "").toCharArray();
		int[] cipher = new int[26];
		for (int i = 0; i< 26; i++){
			cipher[i] = Rotor.toIndex(s[i]);
		}
		int result1 = Rotor.toIndex(s[0]);
		int expected1 = 69-65;

		assertEquals(result1, expected1);



		//String notch1 = "Q";
		/*
		String str2 = "F K Q H T L X O C B J S P D Z R A M E W N I U Y G V";
		String notch2 = "Z and M";
		r.rotorFactory(str, notch1);*/


	}

}
