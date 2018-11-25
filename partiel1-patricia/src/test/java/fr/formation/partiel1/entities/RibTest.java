package fr.formation.partiel1.entities;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * @author Patricia
 */
public class RibTest {

    private static final String BANK_CODE = "12345";

    private static final String SORT_CODE = "12345";

    private static final String ACCOUNT_NUM = "1234567891A";

    private static final String RIB_CLEF = "12";

    @Test
    void shouldConstructRib() {
	assertDoesNotThrow(() -> {
	    new Rib(BANK_CODE, SORT_CODE, ACCOUNT_NUM, RIB_CLEF);
	});
    }

    @Test
    void shouldFailConstruct() {
	assertThrows(NullPointerException.class, () -> {
	    new Rib(null, null, null, null);
	});
    }

    @Test
    void shouldNotFailMethodGetRib() {
	Rib rib = new Rib(BANK_CODE, SORT_CODE, ACCOUNT_NUM, RIB_CLEF);
	assertEquals(BANK_CODE, rib.getBankCode());
	assertEquals(SORT_CODE, rib.getSortCode());
	assertEquals(ACCOUNT_NUM, rib.getAccountNum());
	assertEquals(RIB_CLEF, rib.getRibClef());
    }
}
