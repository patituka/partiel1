package fr.formation.partiel1.entities;

public class Rib {

    private String bankCode;

    private String sortCode;

    private String accountNum;

    private String ribClef;

    /**
     * @param bankCode
     * @param sortCode
     * @param accountNum
     * @param ribClef
     */
    public Rib(String bankCode, String sortCode, String accountNum,
	    String ribClef) {
	setBankCode(bankCode);
	setSortCode(sortCode);
	setAccountNum(accountNum);
	setRibClef(ribClef);
    }

    private void setBankCode(String bankCode) {
	if (bankCode.length() != 5) {
	    throw new IllegalArgumentException(
		    "bankCode must have 5 caracteres");
	}
	this.bankCode = bankCode;
    }

    private void setSortCode(String sortCode) {
	if (sortCode.length() != 5) {
	    throw new IllegalArgumentException(
		    "sortCode must have 5 caracteres");
	}
	this.sortCode = sortCode;
    }

    private void setAccountNum(String accountNum) {
	if (accountNum.length() != 11) {
	    throw new IllegalArgumentException(
		    "accountNum must have 11 caracteres");
	}
	this.accountNum = accountNum;
    }

    private void setRibClef(String ribClef) {
	if (ribClef.length() != 2) {
	    throw new IllegalArgumentException(
		    "ribClef must have 2 caracteres");
	}
	this.ribClef = ribClef;
    }

    public String getBankCode() {
	return bankCode;
    }

    public String getRib() {
	return bankCode + " " + sortCode + " " + accountNum + " " + ribClef;
    }

    public String getSortCode() {
	return sortCode;
    }

    public String getAccountNum() {
	return accountNum;
    }

    public String getRibClef() {
	return ribClef;
    }
}
