/**
 * The basic space ship that all players are given at level 1.
 *
 * Created by Bobby on 6/30/2017.
 */
public class SpaceShip implements SpaceShipInterface{

    private String name;
    private int totalHitPoints;
    private int currentHitPoints;
    private int damage;

    /**
     * Creates a basic, level-1 ship with the given name.
     *
     * @param name The name given to the ship by its player/owner.
     */
    public SpaceShip(String name) {
        this.name = name;
        totalHitPoints = 1000;
        damage = 50;
        currentHitPoints = totalHitPoints;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getTotalHitPoints() {
        return totalHitPoints;
    }

    @Override
    public int getCurrentHitPoints() {
        return currentHitPoints;
    }

    /**
     * Returns the amount of damage that this ship does when it attacks.
     *
     * @return The amount of damage this ship does when it attacks.
     */
    @Override
    public int getDamage() {
        return damage;
    }

    /**
     * Called when another {@link SpaceShip} attacks this ship.
     *
     * @param attacker The attacking {@link SpaceShip}.  Used to determine the
     *                 amount of damage sustained.
     */
    @Override
    public void underAttack(SpaceShipInterface attacker) {
        int damage = attacker.getDamage();
        deductHitPoints(damage);
    }

    /**
     * Returns true if the ship has been destroyed.
     *
     * @return True if the ship has been reduced to 0 hit points.
     */
    @Override
    public boolean isDestroyed() {
        return currentHitPoints <= 0;
    }

    /**
     * Deducts the specified number of hit points from the ship's current hit
     * points.
     *
     * @param amount The amount of hit points to deduct.
     */
    @Override
    public void deductHitPoints(int amount) {
        currentHitPoints = currentHitPoints - amount;
    }
}
