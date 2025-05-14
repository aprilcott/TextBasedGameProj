package characters;
import World.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.random.*;
public class Player {
    Random random = new Random();
    private Integer DamageMin = 100;
    private Integer DamageMax = 110;
    private Integer Playerx = 0, PlayerY = 0;
    private ArrayList inventory = new ArrayList<Item>();
    private Integer Health;
    private Integer getDamage() {
        return this.DamageMin;
    }
    public void addItem(Item item) {
        this.inventory.add(item);
    }
public Integer getHealth() {
    return this.Health;
}
    private Integer CalculateDamage() {
        return random.nextInt(this.DamageMin, this.DamageMax);
    }
    private Integer TakeDamage() {
        return(1);//this.Health = this.Health - MC.getDamage;
    }
 public void getItems() {
    for (int i = 0; i > this.inventory.size(); i++) {
       System.out.println(this.inventory.get(i));
    }
 }
    public Player(Integer Health, String Name, String Dialogue, Integer DamageMin, Integer DamageMax) {
        
    }
}