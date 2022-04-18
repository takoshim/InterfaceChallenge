public class Monster implements ISavable {
    private String name;
    private int hitPoints;
    private int strength;
    private String attackStyle;

    Monster(String name, int hitPoints, int strength, String attackStyle) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.attackStyle = attackStyle;
    }

    String getName() {
        return name;
    }

    int getHitPoints() {
        return hitPoints;
    }

    int getStrength() {
        return strength;
    }

    String getAttackStyle() {
        return attackStyle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAttackStyle(String attackStyle) {
        this.attackStyle = attackStyle;
    }


}
