package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	@DisplayName("test of the ")
	void concatTest() {
		String hello = "Hello";
		hello=hello.concat(" World");
		assertEquals("Hello World", hello);
	}
	
	@Test
	void containsTest()
	{
		String hello = "Hello";
		assertEquals(true, hello.contains("ell"));
		assertEquals(false, hello.contains("elo"));
		assertTrue( hello.contains("ell"));
		assertFalse( hello.contains("elo"));
	}
	
	@Test
	void compareTotest()
	{
		String FirstString="First String";
		String SecondString="Second String";
		String LongFirstString="First String Long";
		String FirstStringWithMistake="FirstString ";
		int Diff;
		assertEquals(0, FirstString.compareTo(FirstString));
		assertTrue(FirstString.compareTo(SecondString)<0);
		assertTrue(SecondString.compareTo(FirstString)>0);
		assertTrue(FirstString.compareTo(LongFirstString)<0);
		assertTrue(SecondString.compareTo(LongFirstString)>0);
		assertTrue(LongFirstString.compareTo(SecondString)<0);
		assertTrue(FirstString.compareTo(FirstStringWithMistake)<0);
		Diff=FirstString.compareTo(SecondString);
		assertEquals(Diff, FirstString.charAt(0)-SecondString.charAt(0));
	}
	
	@Test
	void compareToIgnoreCasetest()
	{
		String FirstStringUpCase="FIRST STRING";
		String FirstStringDownCase="first string";
		String SecondString="Second String";
		String SecondStringWithUp="SEcond String";
		assertTrue(FirstStringUpCase.compareToIgnoreCase(FirstStringDownCase)==0);
		assertTrue(SecondString.compareToIgnoreCase(SecondStringWithUp)==0);
		assertFalse(SecondString.compareTo(SecondStringWithUp)==SecondString.compareToIgnoreCase(SecondStringWithUp));
	}
	
	@Test
	void starstWithtest()
	{
		String FirstString="First String";
		String SecondString="Second String";
		assertTrue(FirstString.startsWith("First"));
		assertTrue(FirstString.startsWith(""));
		assertTrue(FirstString.startsWith(FirstString));
		assertFalse(FirstString.startsWith("Second"));
		assertFalse(FirstString.startsWith("FFirst"));
		
		assertTrue(SecondString.startsWith("eco", 1));
		assertFalse(SecondString.startsWith("eco", 2));
		assertFalse(SecondString.startsWith("ing", 12));
		assertTrue(SecondString.startsWith("ing", 10));
	}
	
	@Test
	void endsWithtest()
	{
		String FirstString="First String";
		String FirstStringAndSpace="First String ";
		assertTrue(FirstString.endsWith("ing"));
		assertFalse(FirstString.endsWith("rig"));
		assertFalse(FirstString.endsWith(FirstStringAndSpace));
		assertTrue(FirstString.endsWith(""));
		assertTrue(FirstString.endsWith(FirstString));	
	}
	
	@Test
	void equalsIgnoreCasetest()
	{
		String FirstStringUpCase="FiRsT StRiNg";
		String FirstStringDownCase="fIrSt sTrInG";
		String FirstStringDownCaseAndSpace="fIrSt  sTrInG";
		String SecondString="SECOND STRING";
		assertTrue(FirstStringUpCase.equalsIgnoreCase(FirstStringDownCase));
		assertFalse(FirstStringUpCase.equalsIgnoreCase(FirstStringDownCaseAndSpace));
		assertFalse(FirstStringUpCase.equalsIgnoreCase(SecondString));	
	}
	
	@Test
	void indexOftest()
	{
		String FirstString="First String";
		assertEquals(0, FirstString.indexOf("Fi"));
		assertEquals(4, FirstString.indexOf("t S"));
		assertEquals(9, FirstString.indexOf("ing"));
		assertEquals(-1, FirstString.indexOf("ing "));
		assertEquals(-1, FirstString.indexOf(" Fir"));
		assertEquals(3, FirstString.indexOf("st"));
		assertEquals(6, FirstString.indexOf("St"));
		assertEquals(0, FirstString.indexOf(""));		
	}
	
	@Test
	void lastIndexOftest()
	{
		String FirstString="First String";
		assertEquals(9,FirstString.lastIndexOf('i'));
		assertEquals(-1,FirstString.lastIndexOf('a'));
		assertEquals(6,FirstString.lastIndexOf('S'));
		assertEquals(3,FirstString.lastIndexOf('s'));		
	}
}
