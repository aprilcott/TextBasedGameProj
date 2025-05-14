package characters;
import World.*;
import java.util.ArrayList;
public class Player {
    private Integer Damage = 100;
    private Integer Playerx = 0, PlayerY = 0;
    private ArrayList inventory = new ArrayList<Item>();
    private Integer getDamage() {
        return this.Damage;
    }
    private void addItem(Item item) {
        this.inventory.add(item);
    }
}
public String getHealth() {
    return this.Health;
    private Integer CalculateDamage() {
        return random.nextInt(this.DamageMin, this.DamageMax);
    }
    private Integer TakeDamage() {
        this.Health = this.Health - MC.getDamage;
    }
 
    public Player(Integer Health, String Name, String Dialogue, Integer DamageMin, Integer DamageMax) {
        
    }
Player Astelle = new Player(100, "Astelle", "I won't let you hurt them", 7, 10);
}
}