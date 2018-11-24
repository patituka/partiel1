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
	this.bankCode = bankCode;
    }

    private void setSortCode(String sortCode) {
	this.sortCode = sortCode;
    }

    private void setAccountNum(String accountNum) {
	this.accountNum = accountNum;
    }

    private void setRibClef(String ribClef) {
	this.ribClef = ribClef;
    }

    public String getBankCode() {
	return bankCode;
    }

    public String getRib() {
	return accountNum + " " + ribClef + " " + bankCode + " " + sortCode;
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
