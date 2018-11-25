package fr.formation.partiel1.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankTransfert {

    private int sum;

    private LocalDateTime dateBt;

    private String ibanA;

    private String ibanB;

    private LocalDateTime dateNow = LocalDateTime.now();

    /**
     * @param sum
     * @param ibanA
     * @param ibanB
     * @param dateBt
     */
    public BankTransfert(int sum, LocalDateTime dateBt, Iban ibanA,
	    Iban ibanB) {
	setSum(sum);
	setDateBt(dateBt);
	if (ibanA.equals(ibanB)) {
	    throw new IllegalArgumentException(
		    "Iban A must be different of iban B");
	}
	setIbanA(ibanA);
	setIbanB(ibanB);
    }

    public void setSum(int sum) {
	if (sum <= 0) {
	    throw new IllegalArgumentException("Sum must be positive!!!");
	}
	this.sum = sum;
    }

    public void setDateBt(LocalDateTime dateBt) {
	if (dateBt.isBefore(dateNow)) {
	    throw new IllegalArgumentException(
		    "Date must be later than today!!!");
	}
	this.dateBt = dateBt;
    }

    public int getSum() {
	return sum;
    }

    public String getDateBt() {
	DateTimeFormatter formatter = DateTimeFormatter
		.ofPattern("yyyy-MM-dd HH:mm:ss");
	String formatDateTime = dateBt.format(formatter);
	return formatDateTime;
    }

    public String getIbanA() {
	return ibanA;
    }

    public void setIbanA(Iban ibanA) {
	this.ibanA = ibanA.getIban();
    }

    public String getIbanB() {
	return ibanB;
    }

    public void setIbanB(Iban ibanB) {
	this.ibanB = ibanB.getIban();
    }
}
