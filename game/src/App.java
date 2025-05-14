import characters.*;
import logic.*;
import World.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
    }
    public static void start() {
        
        Location[][] location = new Location[5][5]
        HostileNPC[][] enemy = new HostileNPC[5][5];
        enemy[1][1] = new HostileNPC(100, "Zombie","Im gonna eat your brains", 10, 15); 
    }
    public static void printMap() {

    }
}
