public interface SpaceShipInterface {
    String getName();
    int getTotalHitPoints();
    int getCurrentHitPoints();
    int getDamage();
    void underAttack(SpaceShipInterface attacker);
    boolean isDestroyed();
    void deductHitPoints(int amount);
}
