package org.project;

import org.project.Models.Club;
import org.project.Models.Player;
import org.project.DatabaseManager;

import java.sql.SQLException;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Club club1 = new Club(UUID.randomUUID(), "Real Madrid", "Carlo Ancelotti");
        DatabaseManager.createCLUB(club1);

        Club club2 = new Club(UUID.randomUUID(), "Liverpool", "Arne Slot");
        DatabaseManager.createCLUB(club2);

        // player instances
        Player player1 = new Player(UUID.randomUUID(), "Thibaut Courtois", club1.getId());
        DatabaseManager.createPlayer(player1);

        Player player2 = new Player(UUID.randomUUID(), "Jude Bellingham", club1.getId());
        DatabaseManager.createPlayer(player2);

        Player player3 = new Player(UUID.randomUUID(), "Trent Alexander-Arnold", club2.getId() );
        DatabaseManager.createPlayer(player3);

        Player player4 = new Player(UUID.randomUUID(), "Federico Valverde", club2.getId() );
        DatabaseManager.createPlayer(player4);
        // todo: call methods to run queries

        //🔍 Step 4: Select and View Data
        DatabaseManager.clubViewer();

        DatabaseManager.playerViewer();


        //🔁 Step 5: Update Records
        DatabaseManager.updateRecords();


        //🔍 Step 6: Select Again
        DatabaseManager.clubViewer();

        DatabaseManager.playerViewer();




    }
}