package org.project;

import org.project.Models.Club;
import org.project.Models.Player;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        // club instances
        Club club1 = new Club(UUID.randomUUID(), "Real Madrid", "Carlo Ancelotti");
        Club club2 = new Club(UUID.randomUUID(), "Liverpool", "Arne Slot");
        // player instances
        Player player1 = new Player(UUID.randomUUID(), "Thibaut Courtois", "white", club1.getId());
        Player player2 = new Player(UUID.randomUUID(), "Jude Bellingham", "black", club1.getId());
        Player player3 = new Player(UUID.randomUUID(), "Trent Alexander-Arnold", "black", club2.getId());
        Player player4 = new Player(UUID.randomUUID(), "Federico Valverde", "white", club1.getId());

        // todo: call methods to run queries
    }
}