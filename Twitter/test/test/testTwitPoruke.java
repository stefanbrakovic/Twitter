package test;

import com.twitter.poruke.TwiterPoruka;

import junit.framework.TestCase;

public class testTwitPoruke extends TestCase {

	TwiterPoruka tp;
	
	
	public void setUp()throws Exception{
	 tp = new TwiterPoruka();
	}
	
	
	public void tearDown() throws Exception{
		tp = null;
	}
	
	public void testSetKorisnik() {
		tp.setKorisnik("Stefan");
		
		assertEquals("Stefan", tp.getKorisnik());
	}	
	//(expected = java.lang.RuntimeException.class)
	public void testSetPoruka() {
		tp.setPoruka("123321asdDSA");
		
		assertEquals("123321asdDSA", tp.getPoruka());
		
	}

	public void testToString() {
		tp.setKorisnik("Stefan");
		tp.setPoruka("ASD");
		
		assertEquals("KORISNIK:Stefan PORUKA:ASD", tp.toString());
		
	}

}
