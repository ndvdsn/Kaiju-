import Behaviours.IAttack;
import Behaviours.IDamage;

public class Tank extends Vehicle implements IAttack, IDamage {

    public Tank(String type, int healthValue, int attackValue){
        super(type, healthValue, attackValue);
    }

    public int attack(IDamage thing){
        int damage = this.getAttackValue();
        thing.takeDamage(damage);
        return damage;
    }

    public int takeDamage(int damage){
        int healthValue = this.getHealthValue();
        this.setHealthValue(healthValue -= damage);
        return healthValue;

    }


}
