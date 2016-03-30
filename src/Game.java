import java.util.Scanner;

/**
 * Game streamlines scanning input into the game.
 */
public class Game {

    static Scanner scanner = new Scanner(System.in);
    private static Player player = new Player();

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome, traveller.");

        player.setName();
        player.setWeapon();
        player.setLocation();
    }
}
