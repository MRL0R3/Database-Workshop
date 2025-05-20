package org.project;

import org.project.Models.Player;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseManager {
    // todo: modify these constants to connect to database
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/workshop";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "35546";

    // a method to connect to database with credentials given
    private static Connection connect() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }

    public static void createPlayer(Player player) throws SQLException {
        Connection conn = connect();
        // todo: fill the query to create a player
        String query = "INSERT INTO player(id , full_name , club_id) VALUES (? , ? , ?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setObject(1 , player.getId());
        ps.setString(2 , player.getFullName());
        ps.setObject(3 , player.getClubId());
        // todo: set values of the prepared statement
        ps.executeUpdate();
        ps.close();
        conn.close();
    }

    // todo: create methods to complete the task of workshop
}
