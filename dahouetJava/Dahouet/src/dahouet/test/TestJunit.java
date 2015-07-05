package dahouet.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dahouet.Model.Licencie;
import dahouet.Model.Personne;

public class TestJunit {

	@Test
	public void testValidMail() {

		assertEquals(true, Personne.VerrifMail("maxime.esbens@gmail.com"));

		assertEquals(false, Personne.VerrifMail("maxime.esbens@gmailcom"));

		assertEquals(false, Personne.VerrifMail("maxime.esbensgmail.com"));

		assertEquals(false, Personne.VerrifMail("maxime.esbens@@gmail.com"));

		assertEquals(true, Personne.VerrifMail("maxime.esbens@gma.il.com"));

		assertEquals(false, Personne.VerrifMail("maximeesbensgmailcom"));

	}

	@Test
	public void testValidDate() {

		assertEquals(true, Licencie.isValidDate("2015/04/27"));

		assertEquals(false, Licencie.isValidDate("2015/13/31"));

		assertEquals(false, Licencie.isValidDate("1800/04/27"));

		assertEquals(false, Licencie.isValidDate("27/04/2015"));

		assertEquals(false, Licencie.isValidDate("27-04-2015"));

		assertEquals(false, Licencie.isValidDate("270420015"));

		assertEquals(false, Licencie.isValidDate("24155512514"));

	}

}
