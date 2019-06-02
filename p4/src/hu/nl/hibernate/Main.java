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
		r.setReizigerId(54);
		r.setAchternaam("testman");
		r.setGeboortedatum(new SimpleDateFormat("dd-mm-yy").parse("06-12-80"));
		r.setVoorletters("TS");

		reiziger r2 = new reiziger();
		r2.setReizigerId(55);
		r2.setAchternaam("testgozer");
		r2.setGeboortedatum(new SimpleDateFormat("dd-mm-yy").parse("06-12-80"));
		r2.setVoorletters("TP");
		
		reiziger r3 = new reiziger();
		r3.setReizigerId(56);
		r3.setAchternaam("testvrouw");
		r3.setGeboortedatum(new SimpleDateFormat("dd-mm-yy").parse("06-12-80"));
		r3.setVoorletters("TT");
		
		session.save(r);
		session.save(r2);
		session.save(r3);
		
		r3.setAchternaam("testo");
		
		session.update(r3);
		
		session.delete(r2);
		
		t.commit();
		factory.close();
		session.close();
	}
}