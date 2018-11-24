package fr.formation.partiel1.controllers;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.formation.partiel1.entities.BankTransfert;
import fr.formation.partiel1.entities.Iban;
import fr.formation.partiel1.entities.Rib;

@Path("transfert")
public class TransfertControllers {

    private final static Map<String, BankTransfert> TRANSFERTS = new HashMap<>();
    static {
	TRANSFERTS.put("01", buildBTA());
    }

    /**
     * @return
     */
    @GET
    @Path("/one")
    @Produces(MediaType.APPLICATION_JSON)
    public BankTransfert one() {
	return TRANSFERTS.get("01");
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public BankTransfert all() {
	return TRANSFERTS.get("01");
    }

    private static BankTransfert buildBTA() {
	int sum = 1000;
	LocalDateTime BTA_date = LocalDateTime.of(2018, 12, 24, 23, 30);
	LocalDateTime BTA_date_wanted = LocalDateTime.of(2018, 12, 25, 23, 30);
	Rib ribA = new Rib("30002", "00550", "0000157841A", "26");
	Iban ibanA = new Iban("FR", "33", ribA);
	Rib ribB = new Rib("30002", "00550", "0000157841B", "25");
	Iban ibanB = new Iban("FR", "33", ribB);
	BankTransfert Bta = new BankTransfert(sum, BTA_date, ibanA, ibanB);
	return Bta;
    }
}
