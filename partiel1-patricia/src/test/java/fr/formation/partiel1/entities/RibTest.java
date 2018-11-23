package fr.formation.partiel1.entities;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author Patricia
 */
public class RibTest {

    private static final String BANK_CODE = null;

    private static final String SORT_CODE = null;

    private static final String ACCOUNT_NUM = null;

    private static final String RIB_CLEF = null;

    @Test
    void shouldConstructRib() {
	assertDoesNotThrow(() -> {
	    new Rib(BANK_CODE, SORT_CODE, ACCOUNT_NUM, RIB_CLEF);
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
