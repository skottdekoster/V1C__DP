package p2;

import java.sql.*;

public class oracleBaseDao {

    protected Connection getConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        //Eerst word de driver geladen.
        Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
        //Daarna word de connectie gemaakt en word er geprint als de connectie gemaakt is.
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xepdb1", "skott", "geheim");
        System.out.println("Connection made");
        //Tot slot word de connectie gereturned zodat hij weer gebruikt kan worden door andere functies.
        return conn;
    }

    public void closeConnection(Connection conn) throws SQLException
    {
        //De connectie die word meegegeven word gesloten.
        conn.close();
    }
    
    public void showAllOV(Connection conn) throws SQLException
    {
        //Er word eerst een statement geinitialiseerd.
        Statement stmt = conn.createStatement();
        //Daarna word de statement gemaakt.
        String strQuery = "SELECT * FROM OV_CHIPKAART";
        //Vervolgens word de statement uitgevoerd.
        ResultSet rs = stmt.executeQuery(strQuery);
       
        //Hier worden een aantal variabelen gedefineerd, hiermee worden de columns van de tabel opgehaald.
        int nr;
        Date geldigTot;
        int klasse;
        int saldo;
        int reizigerID;
        //Hier een while loop om door alle tabel records te gaan, het gaat door tot en met de laatste record.
        while (rs.next()) {  
            //Hier worden de variabelen omgezet in de waardes van de columns per record.
            nr = rs.getInt("KAARTNUMMER"); 
            geldigTot = rs.getDate("GELDIGTOT");
            klasse = rs.getInt("KLASSE");  
            saldo = rs.getInt("SALDO");
            reizigerID = rs.getInt("REIZIGERID");  
            //Hier worden de records geprint.
            System.out.println(nr + ", " + geldigTot + ", " + klasse + ", " + saldo + ", " + reizigerID);
        }
        //Tot slot worden de query and connectie gesloten.
        rs.close();
        closeConnection(conn);
    }

}
















