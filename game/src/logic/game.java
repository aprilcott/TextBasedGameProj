package logic;

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
    }
}
