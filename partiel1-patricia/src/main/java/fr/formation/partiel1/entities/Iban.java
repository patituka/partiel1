package fr.formation.partiel1.entities;

import java.util.Objects;

public class Iban {

    private String code;

    private String clef;

    private Rib rib;

    public Iban(String code, String clef, Rib rib) {
	setCode(code);
	setClef(clef);
	setRib(rib);
    }

    public void setCode(String code) {
	Objects.requireNonNull(code, "Code is required");
	this.code = code;
    }

    public void setClef(String clef) {
	Objects.requireNonNull(clef, "Clef is required");
	this.clef = clef;
    }

    public void setRib(Rib rib) {
	this.rib = rib;
    }

    public String getCode() {
	return code;
    }

    public String getClef() {
	return clef;
    }
}
