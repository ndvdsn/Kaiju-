import Behaviours.IDamage;

public abstract class Building implements IDamage {

    private String type;
    private int healthValue;


    public Building(String type, int healthValue){
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }


    public int takeDamage(int damage){
        int healthValue = this.getHealthValue();
        this.setHealthValue(healthValue -= damage);
        return healthValue;

    }
}
