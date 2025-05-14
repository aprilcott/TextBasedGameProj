
package characters;
import java.util.Random;
import java.util.random.*;
import World.Item;
import World.Location;
import logic.*;

public class Healer {
    Random random = new Random();
    private Integer Health;
    private String Name;
    private String Dialogue;
    private Integer HealingAmount;

    public Healer(String Name, String Dialogue, int par) {
        this.Health = Health;
        this.Name = Name;
        this.Dialogue = Dialogue;
        this.HealingAmount = HealingAmount;
    }

    public String getDialogue() {
        return this.Dialogue;
    }

    public Integer getHealingAmount() {
        return this.HealingAmount;
    }

    public void heal(Player player) {
        player.setHealth(player.getHealth() + this.HealingAmount);
        System.out.println(this.Name + " healed you for " + this.HealingAmount + " health points.");
    }
}



Healer healer = new Healer("Yumi", "I can heal you for 20 health points.", 20);