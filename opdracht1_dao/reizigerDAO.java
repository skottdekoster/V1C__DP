package opdracht1_dao;
import java.util.List;

public interface reizigerDAO {
	   public List<reiziger> getAllReizigers();
	   public reiziger getReiziger(int reizigerID);
	   public void updateReiziger(reiziger reiziger);
	   public void deleteReiziger(reiziger reiziger);
}
