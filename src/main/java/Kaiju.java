import Behaviours.IDamage;

public abstract class Kaiju {

    private String name;
    private int attackValue;
    private int healthValue;

    public Kaiju(String name, int healthValue, int attackValue){
        this.name = name;
        this.attackValue = attackValue;
        this.healthValue = healthValue;
    }

    public String roar(){
        return "Roar";
    }

//    public String fly(){
//        return "flying";
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
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
