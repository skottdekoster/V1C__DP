package p1;

import java.util.*;
import java.sql.*;
import java.sql.Date;

public class main {
	   public static void main(String[] args) {
		      reizigerDao reizigerdao = new reizigerOracleDaoImpl();

//Reizigers uitlezen
		      for (reiziger reiziger : reizigerdao.getAllReizigers()) {
		         System.out.println("Reiziger:"
		         		+ "\n	ID : " + reiziger.getReizigerID()
		         		+ "\n	Voorletters : " + reiziger.getVoorletters() 
		         		+ "\n	Tussenvoegsel : " + reiziger.getTussenvoegsel()
		         		+ "\n	Achternaam : " + reiziger.getAchternaam()
		         		+ "\n	Geboortedatum : " + reiziger.getGeboortedatum()
		         		+ "\n");
		      }


//Reiziger updaten
		      reiziger reiziger1 = reizigerdao.getAllReizigers().get(0);
		      System.out.println(reiziger1.getReizigerID());
		      reizigerdao.updateReiziger(reiziger1);

		      
		      for (reiziger reiziger2 : reizigerdao.getAllReizigers()) {
			         System.out.println("Reiziger:"
			         		+ "\n	ID : " + reiziger2.getReizigerID()
			         		+ "\n	Voorletters : " + reiziger2.getVoorletters() 
			         		+ "\n	Tussenvoegsel : " + reiziger2.getTussenvoegsel()
			         		+ "\n	Achternaam : " + reiziger2.getAchternaam()
			         		+ "\n	Geboortedatum : " + reiziger2.getGeboortedatum()
			         		+ "\n");
			      }	
		      
//Reiziger verwijderen
		      reiziger reiziger3 = reizigerdao.getAllReizigers().get(0);
		      reizigerdao.deleteReiziger(reiziger3);


		      for (reiziger reiziger4 : reizigerdao.getAllReizigers()) {
			         System.out.println("Reiziger:"
			         		+ "\n	ID : " + reiziger4.getReizigerID()
			         		+ "\n	Voorletters : " + reiziger4.getVoorletters() 
			         		+ "\n	Tussenvoegsel : " + reiziger4.getTussenvoegsel()
			         		+ "\n	Achternaam : " + reiziger4.getAchternaam()
			         		+ "\n	Geboortedatum : " + reiziger4.getGeboortedatum()
			         		+ "\n");
			      }	
		   }
	}

