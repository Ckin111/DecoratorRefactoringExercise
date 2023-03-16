public abstract class SpaceShipDecorator implements SpaceShipInterface {
    private SpaceShipInterface ship;

    public SpaceShipDecorator(SpaceShipInterface ship){
        this.ship = ship;
    }

    @Override
    public String getName(){
        return ship.getName();
    }

    @Override
    public int getTotalHitPoints(){
        return ship.getTotalHitPoints();
    }

    @Override
    public int getCurrentHitPoints(){
        return ship.getCurrentHitPoints();
    }

    @Override
    public int getDamage(){
        return ship.getDamage();

    }

    @Override
    public void underAttack(SpaceShipInterface attacker){
        ship.underAttack(attacker);
    }

    @Override
    public boolean isDestroyed(){
        return ship.isDestroyed();
        
    }

    @Override
    public void deductHitPoints(int amount){
        ship.deductHitPoints(amount);;
    }

}