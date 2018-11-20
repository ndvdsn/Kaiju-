import Behaviours.IAttack;
import Behaviours.IDamage;

public class Mellie extends Kaiju implements IAttack, IDamage {

    public Mellie(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
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
