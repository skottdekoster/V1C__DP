package opdracht1_dao;
import java.util.ArrayList;
import java.util.List;

public class reizigerDAOimplement implements reizigerDAO {
	
   //list is working as a database
   List<reiziger> reizigers;

   public reizigerDAOimplement(){
      reizigers = new ArrayList<reiziger>();
      reiziger reiziger1 = new reiziger(0,"test","der","test",java.sql.Date.valueOf("1990-12-23"));
      reiziger reiziger2 = new reiziger(1,"test1","der1","test1",java.sql.Date.valueOf("1990-12-25"));
      reizigers.add(reiziger1);
      reizigers.add(reiziger2);		
   }
   //@Override
   public void deleteReiziger(reiziger reiziger) {
      reizigers.remove(reiziger.getReizigerID());
      System.out.println("reiziger: ID " + reiziger.getReizigerID() + ", deleted from database \n");
   }

   //retrive list of reizigers from the database
   //@Override
   public List<reiziger> getAllReizigers() {
      return reizigers;
   }

   //@Override
   public reiziger getReiziger(int reizigerID) {
      return reizigers.get(reizigerID);
   }

   //@Override
   public void updateReiziger(reiziger reiziger) {
      reizigers.get(reiziger.getReizigerID()).setVoorletters("nieuweTest");
      System.out.println("Reiziger: ID " + reiziger.getReizigerID() + ", updated in the database \n");
   }
}
