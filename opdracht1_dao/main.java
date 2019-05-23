package opdracht1_dao;

public class main {
	   public static void main(String[] args) {
	      reizigerDAO reizigerdao = new reizigerDAOimplement();

	      //print all reizigers
	      for (reiziger reiziger : reizigerdao.getAllReizigers()) {
	         System.out.println("Reiziger:"
	         		+ "\n	ID : " + reiziger.getReizigerID()
	         		+ "\n	Voorletters : " + reiziger.getVoorletters() 
	         		+ "\n	Tussenvoegsel : " + reiziger.getTussenvoegsel()
	         		+ "\n	Achternaam : " + reiziger.getAchternaam()
	         		+ "\n	Geboortedatum : " + reiziger.getGeboortedatum()
	         		+ "\n");
	      }


	      //update reiziger
	      reiziger reiziger1 = reizigerdao.getAllReizigers().get(0);
	      System.out.println(reiziger1.getReizigerID());
	      reizigerdao.updateReiziger(reiziger1);

	      //get the reiziger
	      for (reiziger reiziger2 : reizigerdao.getAllReizigers()) {
		         System.out.println("Reiziger:"
		         		+ "\n	ID : " + reiziger2.getReizigerID()
		         		+ "\n	Voorletters : " + reiziger2.getVoorletters() 
		         		+ "\n	Tussenvoegsel : " + reiziger2.getTussenvoegsel()
		         		+ "\n	Achternaam : " + reiziger2.getAchternaam()
		         		+ "\n	Geboortedatum : " + reiziger2.getGeboortedatum()
		         		+ "\n");
		      }	
	      
	      //delete reiziger
	      reiziger reiziger3 = reizigerdao.getAllReizigers().get(0);
	      reizigerdao.deleteReiziger(reiziger3);

	      //get the reiziger
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