package fr.formation.partiel1.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Transferts {

    private List<BankTransfert> transfertView = new ArrayList<>();

    public List<BankTransfert> getTransfertView() {
	return Collections.unmodifiableList(transfertView);
    }

    public boolean add(BankTransfert bankTransfert) {
	Objects.requireNonNull(bankTransfert,
		"Bank transfert must not be null");
	return transfertView.add(bankTransfert);
    }
}
