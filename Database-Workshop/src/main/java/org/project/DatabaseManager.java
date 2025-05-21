package org.project;

import org.project.Models.Player;
import org.project.Models.Club;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseManager {
    // todo: modify these constants to connect to database
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "35546";





    // a method to connect to database with credentials given
    private static Connection connect() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver"); // Loads the PostgreSQL JDBC driver
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }
    public static void createCLUB(Club club) throws SQLException, ClassNotFoundException {

        try {
            Connection conn = connect();
            String query = "INSERT INTO club(id , title , manager) VALUES (? , ? , ?)";


            PreparedStatement ps = conn.prepareStatement(query);
            ps.setObject(1, club.getId());
            ps.setString(2, club.getTitle());
            ps.setString(3, club.getManager());

            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        public static void createPlayer(Player player) throws SQLException, ClassNotFoundException {


        // todo: fill the query to create a player
        try {
            Connection conn = connect();
            String query = "INSERT INTO player(id , full_name , club_id) VALUES (? , ? , ?)";


            PreparedStatement ps = conn.prepareStatement(query);
            ps.setObject(1 , player.getId());
            ps.setString(2 , player.getFullName());
            ps.setObject(3 , player.getClubId());

            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }







    // todo: create methods to complete the task of workshop
    public static void clubViewer() throws SQLException, ClassNotFoundException {
        Connection conn = connect();
        var st = conn.createStatement();
        var rs = st.executeQuery("SELECT * FROM club");
        System.out.println("--- Clubs ---");
        while (rs.next()) {
            System.out.printf("%s | %s | %s\n", rs.getObject("id"),
                    rs.getString("title"),
                    rs.getString("manager"));
        }
        System.out.println();
        rs.close();
        st.close();

    }
    public static void playerViewer() throws SQLException, ClassNotFoundException {
        Connection conn = connect();
        var st = conn.createStatement();
        var rs = st.executeQuery("SELECT * FROM player");
        System.out.println("--- Players ---");
        while (rs.next()) {
            System.out.printf("%s | %s | %s\n", rs.getObject("id"),
                    rs.getString("full_name"),
                    rs.getObject("club_id"));
        }
        System.out.println();
        rs.close();
        st.close();

    }


    public static void updateRecords() {
        try (Connection conn = connect();
             PreparedStatement pstmt1 = conn.prepareStatement("UPDATE players SET clubId = (SELECT id FROM clubs WHERE title = 'Real Madrid') WHERE fullName = 'Alexander-Arnold'");
             PreparedStatement pstmt2 = conn.prepareStatement("UPDATE clubs SET manager = 'Alonso' WHERE title = 'Real Madrid'");) {
            pstmt1.executeUpdate();
            pstmt2.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
