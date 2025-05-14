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
