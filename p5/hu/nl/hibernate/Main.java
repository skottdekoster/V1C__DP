package hu.nl.hibernate;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
	public static void main(String[] args) throws SQLException, ParseException {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		reiziger r = new reiziger();
		r.setReizigerId(43);
		r.setAchternaam("Test");
		r.setGeboortedatum(new SimpleDateFormat("dd-mm-yy").parse("06-12-80"));
		r.setVoorletters("SJ");

		reiziger r2 = new reiziger();
		r2.setReizigerId(44);
		r2.setAchternaam("Test2");
		r2.setGeboortedatum(new SimpleDateFormat("dd-mm-yy").parse("06-12-80"));
		r2.setVoorletters("SP");
		
		reiziger r3 = new reiziger();
		r3.setReizigerId(45);
		r3.setAchternaam("Test3");
		r3.setGeboortedatum(new SimpleDateFormat("dd-mm-yy").parse("06-12-80"));
		r3.setVoorletters("SO");
		
		OvChipkaart k = new OvChipkaart();
		k.setGeldigTot(new SimpleDateFormat("dd-mm-yy").parse("08-03-86"));
		k.setKaartNummer(12345);
		k.setKlasse(1);
		k.setReizigerID(44);
		k.setSaldo(10.50);

		OvChipkaart k2 = new OvChipkaart();
		k2.setGeldigTot(new SimpleDateFormat("dd-mm-yy").parse("09-03-86"));
		k2.setKaartNummer(12346);
		k2.setKlasse(2);
		k2.setReizigerID(43);
		k2.setSaldo(10.52);
		
		OvChipkaart k3 = new OvChipkaart();
		k3.setGeldigTot(new SimpleDateFormat("dd-mm-yy").parse("10-03-86"));
		k3.setKaartNummer(12347);
		k3.setKlasse(3);
		k3.setReizigerID(43);
		k3.setSaldo(10.51);
		
		session.save(r);
		session.save(r2);
		session.save(r3);
		session.save(k);
		session.save(k2);
		session.save(k3);
		
		r3.setAchternaam("Test4");
		
		session.update(r3);
		
		session.delete(k);
		session.delete(r2);
		
		k2.setSaldo(60.5);
		
		session.update(k2);
		
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();
	}
}