package p1;

import java.util.*;
import java.sql.*;

public interface reizigerDao {
	   public List<reiziger> getAllReizigers();
	   public reiziger getReiziger(int reizigerID);
	   public void updateReiziger(reiziger reiziger);
	   public void deleteReiziger(reiziger reiziger);
}
