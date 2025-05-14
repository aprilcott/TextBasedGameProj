package characters;

public class Player {
    private String damage;
    private Integer Playerx, PlayerY;
    private String PlayerName;
    private String PlayerDialogue;
    private Integer PlayerHealth;
    private Integer PlayerDamageMin;
    private String getDamage() {
        return this.damage;
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