package logic;

<<<<<<< HEAD
import characters.HostileNPC;
import characters.Player;

public class game {
    public static void start() {
        HostileNPC[][] enemy = new HostileNPC[5][5];
        enemy[1][1] = new HostileNPC(100, "Vanica", "Get biwitched", 10, 15);
        enemy[1][2] = new HostileNPC(100, "Zeroe", "Don't test me", 10, 15);
        enemy[1][3] = new HostileNPC(100, "Mika", "AHAHAHAHA", 10, 15);
    }
  
    public static void printMap() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + i + "," + j + "]");
            }
            System.out.println();
        }
=======
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

>>>>>>> 3ba3d7ddc484a580c7f89548bac1b7ea80e9a78a
    }
}
