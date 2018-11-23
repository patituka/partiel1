package fr.formation.partiel1.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankTransfert {

    private int sumTransfered;

    private Iban a;

    private Iban b;

    private LocalDateTime dateBt;

    public BankTransfert(int sumTransfered, Iban a, Iban b,
	    LocalDateTime dateBt) {
	setSumTransfered(sumTransfered);
	setAccountA(a);
	setAccountB(b);
	setDateBt(dateBt);
    }

    public void setSumTransfered(int sumTransfered) {
	this.sumTransfered = sumTransfered;
    }

    public void setAccountA(Iban accountA) {
	a = accountA;
    }

    public void setAccountB(Iban accountB) {
	b = accountB;
    }

    public void setDateBt(LocalDateTime dateBt) {
	this.dateBt = dateBt;
    }

    public int getSumTransfered() {
	return sumTransfered;
    }

    public Iban getA() {
	return a;
    }

    public Iban getB() {
	return b;
    }

    public String getDateBt() {
	DateTimeFormatter formatter = DateTimeFormatter
		.ofPattern("yyyy-MM-dd HH:mm:ss");
	String formatDateTime = dateBt.format(formatter);
	return formatDateTime;
    }
}
