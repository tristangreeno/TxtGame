/**
 * Player class sets variables that the player chooses.
 */
public class Player {

    public final void setName() {
        System.out.println("What is your name?");
        String name = Game.scanner.nextLine();
        System.out.println("Welcome, " + name);
    }

    public final void setWeapon() throws Exception {
        System.out.println("Choose your weapon (Sword, Mace, Staff, Bow): ");
        String weapon = Game.scanner.nextLine();
        if(weapon.equalsIgnoreCase("sword")) {
            System.out.println("May your blade be ever sharp.");
        }
        else if (weapon.equalsIgnoreCase("mace")) {
            System.out.println("May your strikes be true.");
        }
        else if (weapon.equalsIgnoreCase("staff")) {
            System.out.println("May your staff burn their hearts.");
        }
        else if (weapon.equalsIgnoreCase("bow")) {
            System.out.println("May your arrows pierce their flesh.");
        }
        else {
                throw new Exception("Enter a valid weapon (Sword, mace, staff, or bow)!");
        }
    }

    public final void setLocation() throws Exception{
        System.out.println("Choose your location: Forest/Cave");
        String location = Game.scanner.nextLine();
        if (location.equalsIgnoreCase("Forest")) {
            System.out.println("You tread into the dark woods ahead...");
        }
        else if (location.equalsIgnoreCase("Cave")) {
            System.out.println("You dare to enter the damp cave behind...");
        }
        else {
            throw new Exception("Enter a valid location (Forest/Cave)");
        }
    }
}
