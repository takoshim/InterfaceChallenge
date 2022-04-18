import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable {
    private String name;
    private int hitPoints;
    private int strength;

    Monster(String name, int hitPoints, int strength, String attackStyle) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
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

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> savedValues = new ArrayList<String>();
        savedValues.add(0, this.getName());
        savedValues.add(1, "" + this.getHitPoints());
        savedValues.add(2, "" + this.getStrength());
        return savedValues;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null || savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }
}
