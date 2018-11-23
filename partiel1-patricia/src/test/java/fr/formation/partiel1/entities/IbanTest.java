package fr.formation.partiel1.entities;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class IbanTest {

     public static final String CLEF = "FR";

     public static final String CODE = "33";

     public static final Rib RIB = new Rib("30002", "00550", "0000157841Z",
	    "25");

    @Test
    void shouldConstructBA() {
	assertDoesNotThrow(() -> {
	    new Iban(CODE, CLEF, RIB);
	});
    }

    @Test
    void shouldFailConstruct() {
	assertThrows(NullPointerException.class, () -> {
	    new Iban(null, null, null);
	});
    }

    @Test
    void shouldBeEqualValues() {
	Iban bankAccount = new Iban(CODE, CLEF, RIB);
	String codeActual = bankAccount.getCode();
	assertEquals(CODE, codeActual);
	String clefActual = bankAccount.getClef();
	assertEquals(CLEF, clefActual);
    }
}
