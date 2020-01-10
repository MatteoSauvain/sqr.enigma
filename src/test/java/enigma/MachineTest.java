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

}
