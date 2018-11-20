import Behaviours.IAttack;
import Behaviours.IDamage;

public class Car extends Vehicle implements IAttack, IDamage {

    public Car(String type, int healthValue, int attackValue){
        super(type, healthValue, attackValue);
    }

//    public int attack(IDamage thing){
//        int damage = this.getAttackValue();
//        thing.takeDamage(damage);
//        return damage;
//    }
//
//    public int takeDamage(int damage){
//        int healthValue = this.getHealthValue();
//        this.setHealthValue(healthValue -= damage);
//        return healthValue;
//
//    }
}
