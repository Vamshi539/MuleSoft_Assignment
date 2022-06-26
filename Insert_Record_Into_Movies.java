import java.sql.*;

public class Insert_Record_Into_Movies {
    public static void main(String[] args) {
        try {

            Connection con = null;
            Statement stmt = null;

            con = DriverManager
                    .getConnection("jdbc:sqlite:C:\\SQLite\\sqlite-tools-win32-x86-3390000\\Vamshi.db");

            System.out.println("Database Connection Successful !!");

            stmt = con.createStatement(); // Create Statement

            String query0 = "INSERT INTO LikedMovies values ('Abhimanyudu','Vishal','Samantha', 2018,'P.S Mithran');";
            stmt.executeUpdate(query0); // Create Query-1

            String query1 = "INSERT INTO LikedMovies values ('Gowtham Nandha','Gopi Chand','Hansika', 2017,'Sampath Nandi');";
            stmt.executeUpdate(query1); // Create Query-1

            String query2 = "INSERT INTO LikedMovies values ('Ninnu Kori','Nani','Nivedha Thomas',2017,'Shiva Nirvana');";
            stmt.executeUpdate(query2); // Create Query-2

            String query3 = "INSERT INTO LikedMovies values ('Chhichhore','Sushanth singh Rajput','Shradha Kapoor',2019,'Nitesh Tiwari');";
            stmt.executeUpdate(query3); // Create Query-3

            String query4 = "INSERT INTO LikedMovies values ('Bahubali','Prabhas','Anushka',2015,'S.S Rajamouli');";
            stmt.executeUpdate(query4); // Create Query-4

            String query5 = "INSERT INTO LikedMovies values ('Super30','Hrithik Roshan','Mrunal Thakur',2019,'Vikas Bahl');";
            stmt.executeUpdate(query5);
            stmt.close();

            con.close();                //Close Connection
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Record  Insertion successful");
    }
}