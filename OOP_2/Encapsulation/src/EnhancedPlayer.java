public class EnhancedPlayer {
    // encapsulation
    private String name;
    // set default health value
    private int hitPoints = 100;
    private String weapon;


    // only way to create a player, is through this constructor, using encapsulation
    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        // if not true, health is set to 100 from initial setting of health variable
        if(health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            // reduce number of lives remaining for the player

        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
