package p2;

import java.sql.*;
import java.util.*;
import java.sql.Date;

public class ovchipkaart {
	private int kaartNummer;
	private Date geldigTot;
	private int saldo; 
	private String achternaam;
	private reiziger reizigerID;
	
	//De constructor
	public ovchipkaart(int kn, Date gt, int sa, String ac, reiziger rID)
	{
		kaartNummer = kn;
		geldigTot = gt;
		saldo = sa;
		achternaam = ac;
		reizigerID = rID;
	}

	//alle gets
	public int getKaartNummer() {
		return kaartNummer;
	}

	public Date getGeldigTot() {
		return geldigTot;
	}

	public int getSaldo() {
		return saldo;
	}

	public String getAchternaam() {
		return achternaam;
	}
	
	public reiziger getReizigerID() {
		return reizigerID;
	}

	
	
	//alle sets
	public void setKaartNummer(int kaartNummer) {
		this.kaartNummer = kaartNummer;
	}

	public void setGeldigTot(Date geldigTot) {
		this.geldigTot = geldigTot;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	
	public void setReizigerId(reiziger r) {
		reizigerID = r;
	}

	

}
