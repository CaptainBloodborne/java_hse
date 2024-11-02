package CircusManager;

import java.time.LocalDate;
import java.util.ArrayList;

public class Trick extends Circus {
    private ArrayList<String> inventory = new ArrayList<>();

    private String tricksType;

    public Trick(String perfomanceName, String city, LocalDate openingDate, int perfomanceDuration, int ticketPrice, String tricksType) {
        super(perfomanceName, city, openingDate, perfomanceDuration, ticketPrice);
        this.tricksType = tricksType;
    }

    public void addItemToInventory(String item) {
        inventory.add(item);
    }

    public void removeItemFromInventory(String item) {
        inventory.remove(item);
    }

    public ArrayList<String> getInvetory() {
        return inventory;
    }

    public void setTricksType(String tricksType) {
        this.tricksType = tricksType;
    }

    public String getTricksType() {
        return tricksType;
    }

    @Override public String toString()
    {
        return (super.toString() + "\nФокусы:"
                + "\nВид фокусов: " + tricksType
                + "\nИнвентарь: " + inventory + "\n");
    }
}