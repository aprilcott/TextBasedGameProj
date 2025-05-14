package logic;

import characters.*;
import logic.*;
import World.*;

public class game {
    public static void start() {
        Player MC = new Player(100, "MC", "hello", 1, 2);
        Item healthPotion = new Item("Health potion", "Heals you twenty points", "health", 20);
        MC.addItem(healthPotion);
        System.out.println("Game started");
    }
    public static void collectItem(Item item) {

    }
}
