package fr.formation.partiel1.entities;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class BankTransfertTest {

    private final static int SUM_BT = 100;

    private static Rib ribA = new Rib("30002", "00550", "0000123456Z", "25");

    private static Rib ribB = new Rib("30002", "00550", "0000234567Z", "30");

    private final static Iban ACCOUNT_A = new Iban("33", "FR", ribA);

    private final static Iban ACCOUNT_B = new Iban("33", "FR", ribB);

    private final static LocalDateTime DATE_BT = LocalDateTime.of(2018, 12, 24,
	    23, 30);

    private final static LocalDateTime DATE_WANTED = LocalDateTime.of(2018, 12,
	    25, 12, 30);

    @Test
    void shouldConstruct() {
	assertDoesNotThrow(() -> {
	    new BankTransfert(SUM_BT, ACCOUNT_A, ACCOUNT_B, DATE_BT);
	});
    }
}
