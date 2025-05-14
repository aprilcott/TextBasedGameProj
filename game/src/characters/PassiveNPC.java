package characters;

public class PassiveNPC {
    private String Name;
    private String Dialogue;
    private Integer LocationX, LocationY;
    public String speak() {
        return this.Dialogue;
    }
    public PassiveNPC(String Name, String Dialogue, Integer Locationx, Integer LocationY) {
        this.Name = Name;
        this.Dialogue = Dialogue;
        this.LocationX = Locationx;
        this.LocationY = LocationY;
    }

}
