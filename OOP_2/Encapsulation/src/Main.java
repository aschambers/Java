public class Main {
    public static void main(String[] args) {
        // wrong way, not using encapsulation
//        Player player = new Player();
//        player.name = "Alan";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        // want to control the amount of health a player has, and not let him change them directly.
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        // right way, using encapsulation from EnhancedPlayer class
        EnhancedPlayer player = new EnhancedPlayer("Alan", 200, "Sword");
        // need to use getter to get direct access to health, since variables in EnhancedPlayer class are private
        System.out.println("Initial health is " + player.getHealth());
    }
}
