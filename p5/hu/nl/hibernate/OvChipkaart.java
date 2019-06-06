package hu.nl.hibernate;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="OV_CHIPKAART")
public class OvChipkaart {
	
	private int kaartNummer;
	private Date geldigTot;
	private int klasse;
	private double saldo;
	@OneToMany(mappedBy="kaart")
    private int reizigerID;

	public int getReizigerID() {
		return reizigerID;
	}

	public void setReizigerID(int reizigerID) {
		this.reizigerID = reizigerID;
	}

	public OvChipkaart() {}
	
	public void setKaartNummer(int kaartnummer) {
		this.kaartNummer = kaartnummer;
	}
	
	public int getKaartNummer() {
		return this.kaartNummer;
	}
	
	public void setGeldigTot(Date geldigTot) {
		this.geldigTot = geldigTot;
	}
	
	public Date getGeldigTot() {
		return this.geldigTot;
	}
	
	public void setKlasse(int klasse) {
		this.klasse = klasse;
	}
	
	public int getKlasse() {
		return this.klasse;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
