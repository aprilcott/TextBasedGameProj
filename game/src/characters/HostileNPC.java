package characters;
import java.util.Random;
import java.util.random.*;
public class HostileNPC {
    Random random = new Random();
    private String Health;
    private String Name;
    private String Dialogue;
    private Integer DamageMin;
    private Integer DamageMax;
    private String Talk() {
        return this.Dialogue;
    }
    private Integer CalculateDamage() {
        return random.nextInt(this.DamageMin, this.DamageMax);
    }
    private Integer TakeDamage() {
        this.Health = this.Health - MC.getDamage;
    }
    public HostileNPC(Integer Health, String Name, String Dialogue, Integer DamageMin, Integer DamageMax) {
        
    }
    HostileNPC zombie = new HostileNPC(100, "Zombie", "Im gonna eat your rains", 7, 10);
}