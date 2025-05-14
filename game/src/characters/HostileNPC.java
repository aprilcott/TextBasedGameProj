package characters;
import java.util.Random;
import java.util.random.*;
public class HostileNPC {
    Random random = new Random();
    private Integer Health;
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
        return(1);
        //this.Health = this.Health - MC.getDamage;
    }
    public HostileNPC(Integer Health, String Name, String Dialogue, Integer DamageMin, Integer DamageMax) {
        this.Health = Health;
        this.Name = Name;
        this.Dialogue = Dialogue;
        this.DamageMin = DamageMin;
        this.DamageMax = DamageMax;
    }
    public Integer getHealth() {
        return this.Health;
    }
}