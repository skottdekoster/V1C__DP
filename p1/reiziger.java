package p1;

import java.sql.*;
import java.util.*;
import java.sql.Date;

public class reiziger {
	private int reizigerID;
	private String voorletters;
	private String tussenvoegsel;
	private String achternaam;
	private Date geboortedatum;
	
	//De constructor
	public reiziger(int id, String vl, String tv, String an, Date gd)
	{
		reizigerID = id;
		voorletters = vl;
		tussenvoegsel = tv;
		achternaam = an;
		geboortedatum = gd;
	}

	//alle gets
	public int getReizigerID() {
		return reizigerID;
	}

	public String getVoorletters() {
		return voorletters;
	}

	public String getTussenvoegsel() {
		return tussenvoegsel;
	}

	public String getAchternaam() {
		return achternaam;
	}

	public Date getGeboortedatum() {
		return geboortedatum;
	}
	

	//alle sets
	public void setReizigerID(int reizigerID) {
		this.reizigerID = reizigerID;
	}

	public void setVoorletters(String voorletters) {
		this.voorletters = voorletters;
	}

	public void setTussenvoegsel(String tussenvoegsel) {
		this.tussenvoegsel = tussenvoegsel;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}

	public void setGeboortedatum(Date geboortedatum) {
		this.geboortedatum = geboortedatum;
	}
	

}
