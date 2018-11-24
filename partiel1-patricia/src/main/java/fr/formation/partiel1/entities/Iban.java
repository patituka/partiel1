package fr.formation.partiel1.entities;

import java.util.Objects;

public class Iban {

    private String code;

    private String clef;

    private String rib;

    /**
     * @param code
     * @param clef
     * @param rib
     */
    public Iban(String code, String clef, Rib rib) {
	setCode(code);
	setClef(clef);
	setRib(rib);
    }

    public String getRib() {
	return rib;
    }

    public void setRib(Rib rib) {
	this.rib = rib.getRib();
    }

    public void setCode(String code) {
	Objects.requireNonNull(code, "Code is required");
	this.code = code;
    }

    public void setClef(String clef) {
	Objects.requireNonNull(clef, "Clef is required");
	this.clef = clef;
    }

    public String getIban() {
	return code + " " + clef + " " + rib;
    }

    public String getCode() {
	return code;
    }

    public String getClef() {
	return clef;
    }
}
