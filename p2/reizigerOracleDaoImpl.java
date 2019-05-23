package p2;

import java.util.*;
import java.sql.*;
import java.sql.Date;

public class reizigerOracleDaoImpl implements reizigerDao {
	
//voor nu word alles opgeslagen in de lijst
	   List<reiziger> reizigers;

	   public reizigerOracleDaoImpl(){
	      reizigers = new ArrayList<reiziger>();
	      reiziger reiziger1 = new reiziger(1,"testo","van","testen",java.sql.Date.valueOf("1990-12-23"));
	      reiziger reiziger2 = new reiziger(2,"testman","der","test",java.sql.Date.valueOf("1990-12-25"));
	      reizigers.add(reiziger1);
	      reizigers.add(reiziger2);		
	   }

	   public void deleteReiziger(reiziger reiziger) {
	      reizigers.remove(reiziger.getReizigerID());
	      System.out.println("reiziger: ID " + reiziger.getReizigerID() + ", deleted from database");
	   }


	   public List<reiziger> getAllReizigers() {
	      return reizigers;
	   }


	   public reiziger getReiziger(int reizigerID) {
	      return reizigers.get(reizigerID);
	   }


	   public void updateReiziger(reiziger reiziger) {
	      reizigers.get(reiziger.getReizigerID()).setVoorletters(reiziger.getVoorletters());
	      System.out.println("Reiziger: ID " + reiziger.getReizigerID() + ", updated in the database");
	   }
	}